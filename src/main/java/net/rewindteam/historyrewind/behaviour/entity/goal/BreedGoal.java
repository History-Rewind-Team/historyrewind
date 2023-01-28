package net.rewindteam.historyrewind.behaviour.entity.goal;

import net.minecraft.core.BlockPos;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.entity.GeneralEntity;
import net.rewindteam.historyrewind.entity.Species;

public class BreedGoal extends Goal {

    Species species;
    BlockPos congregationSpot;
    EntityBehaviour behaviourParent;

    public BreedGoal(EntityBehaviour behavior, Species species) {
        this.species = species;
        this.behaviourParent = behavior;
        Goal avoidGoal = new AvoidGoal(species.getSpecies2Avoid());
    }

    @Override
    public void execute(GeneralEntity entity) {

    }

    @Override
    public boolean executeWithResult(GeneralEntity entity) {
        return false;
    }
}