package net.rewindteam.historyrewind.behaviour.intention.goal;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.behavior.Behavior;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
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
    public void execute() {

    }
}