package net.rewindteam.historyrewind.behaviour.entity.prehistory;

import net.minecraft.core.BlockPos;
import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.behaviour.intention.Intention;
import net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies;

public class CompyBehaviour extends EntityBehaviour {

    private Intention currentIntention;

    public CompyBehaviour() {
        super(new Diet(PrehistorySpecies.Mesozoic.COMPY));
    }

    public void modifyBreedingArea(BlockPos center, int allowedDistance) {
        this.breedingCongregationSpot = center;
        this.diameterOfBreedingCircle = allowedDistance * 2;
    }

    public void gotoPos(BlockPos blockPos) {
        this.currentIntention = new Intention(blockPos);
    }

    @Override
    public void onTick() {

    }
}