package net.rewindteam.historyrewind.behaviour.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.behavior.Behavior;
import net.rewindteam.api.IndexableMap;
import net.rewindteam.historyrewind.entity.GeneralEntity;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.math.BlockMaths;

public class EntityBehaviour implements IEntityBehaviour{

    int minGroupAmount;
    int maxGroupAmount;
    int preferableGroupAmount;
    Diet diet;
    private BlockPos breedingCongregationSpot;
    private int diameterOfBreedingCircle;

    public EntityBehaviour(GeneralEntity entity, Diet diet) {
        this.minGroupAmount = 0;
        this.maxGroupAmount = 0;
        this.preferableGroupAmount = 0;
        this.diet = diet;
    }

    public EntityBehaviour(Diet diet) {
        this.minGroupAmount = 0;
        this.maxGroupAmount = 0;
        this.preferableGroupAmount = 0;
        this.diet = diet;
    }

    public EntityBehaviour(GeneralEntity entity, Diet diet, int minGroupAmount, int maxGroupAmount) {
        this.minGroupAmount = minGroupAmount;
        this.maxGroupAmount = maxGroupAmount;
        this.preferableGroupAmount = -1;
        this.diet = diet;
    }

    public EntityBehaviour(GeneralEntity entity, Diet diet, int minGroupAmount, int maxGroupAmount, int preferableGroupAmount) {
        this.minGroupAmount = minGroupAmount;
        this.maxGroupAmount = maxGroupAmount;
        this.preferableGroupAmount = preferableGroupAmount;
        this.diet = diet;
    }

    public EntityBehaviour(Diet diet, int minGroupAmount, int maxGroupAmount) {
        this.minGroupAmount = minGroupAmount;
        this.maxGroupAmount = maxGroupAmount;
        this.preferableGroupAmount = -1;
        this.diet = diet;
    }

    public EntityBehaviour(Diet diet, int minGroupAmount, int maxGroupAmount, int preferableGroupAmount) {
        this.minGroupAmount = minGroupAmount;
        this.maxGroupAmount = maxGroupAmount;
        this.preferableGroupAmount = preferableGroupAmount;
        this.diet = diet;
    }

    public BlockPos getBreedingAreaCenter() {
        return this.breedingCongregationSpot;
    }

    public int getBreedingAreaDiameter() {
        return this.diameterOfBreedingCircle;
    }

    public static int getBreedingAreaValidity(GeneralEntity entity) {
        IndexableMap<BlockPos, Integer> allSpots = BlockMaths.getPositionsInCircle(entity.getBehaviour().breedingCongregationSpot,
                entity.getBehaviour().diameterOfBreedingCircle);
        if(allSpots.get(entity.getPosition()) == null)
            return -1;
        return allSpots.get(entity.getPosition());
    }

    @Override
    public void onTick() {
        if(this.maxGroupAmount == 0) {
            //Solitary

        } else {
            //Non-solitary
        }
    }
}