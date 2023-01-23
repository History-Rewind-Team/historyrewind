package net.rewindteam.historyrewind.behaviour.entity;

import net.rewindteam.historyrewind.entity.Species;

public class Diet {

    public float carnivorousWeight;
    public float herbivorousWeight;

    public Diet(float carnivorousWeight, float herbivorousWeight) {
        this.carnivorousWeight = carnivorousWeight;
        this.herbivorousWeight = herbivorousWeight;
    }

    public Diet(Species species) {
        this.carnivorousWeight = species.getCarnivorousWeight();
        this.herbivorousWeight = species.getHerbivorousWeight();
    }
}