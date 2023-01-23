package net.rewindteam.historyrewind.entity;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;

public abstract class SpeciesBuilder {

    public SpeciesBuilder(Diet defaultDiet) {
        this.defaultDiet = defaultDiet;
        this.behaviour = new EntityBehaviour(defaultDiet, 0, 0, 0);
    }

    public SpeciesBuilder(Diet diet, EntityBehaviour behaviour) {
        this.defaultDiet = diet;
        this.behaviour = behaviour;
    }

    protected Diet defaultDiet;
    protected EntityBehaviour behaviour;

    public abstract Diet getDiet();
}