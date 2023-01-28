package net.rewindteam.historyrewind.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;

public class GeneralEntity {

    EntityBehaviour behaviour;
    protected BlockPos position;
    Species species;

    public GeneralEntity(EntityBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public EntityBehaviour getBehaviour() {
        return this.behaviour;
    }

    public Species getSpecies() {
        return this.species;
    }

    public BlockPos getPosition() {
        return this.position;
    }
}