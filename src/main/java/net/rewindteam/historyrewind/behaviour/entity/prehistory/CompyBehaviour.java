package net.rewindteam.historyrewind.behaviour.entity.prehistory;

import net.minecraft.core.BlockPos;
import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.behaviour.entity.goal.BreedGoal;
import net.rewindteam.historyrewind.behaviour.entity.goal.Goal;
import net.rewindteam.historyrewind.behaviour.entity.goal.GotoGoal;
import net.rewindteam.historyrewind.entity.GeneralEntity;

public class CompyBehaviour extends EntityBehaviour {

    private Goal currentGoal;
    private static int timeSinceLastBreed;
    private static boolean canBreed;

    public CompyBehaviour(GeneralEntity entity, Diet diet) {
        super(entity, diet);
        canBreed = true;
    }

    public CompyBehaviour(Diet diet) {
        super(diet);
        canBreed = true;
    }

    public void modifyBreedingArea(BlockPos center, int allowedDistance) {
        this.breedingCongregationSpot = center;
        this.diameterOfBreedingCircle = allowedDistance * 2;
    }

    public void gotoPos(BlockPos blockPos) {
        this.currentGoal = new GotoGoal(blockPos);
    }

    @Override
    public void onTick() {
        if(canBreed) {
            currentGoal = new BreedGoal(this, entity.getSpecies());
            boolean hasBred = currentGoal.executeWithResult(entity);
            if(hasBred) {
                timeSinceLastBreed = -1;
                canBreed = false;
                currentGoal = null;
            }
        } else if(timeSinceLastBreed == 1200) {
            timeSinceLastBreed = -1;
            canBreed = true;
        } else if(timeSinceLastBreed == 0) {
            timeSinceLastBreed++;
        } else {
            timeSinceLastBreed = 0;
        }
    }
}