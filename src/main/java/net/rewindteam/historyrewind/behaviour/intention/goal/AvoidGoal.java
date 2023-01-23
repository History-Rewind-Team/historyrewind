package net.rewindteam.historyrewind.behaviour.intention.goal;

import net.rewindteam.historyrewind.entity.Species;

public class AvoidGoal extends Goal {

    Species[] avoidSpecies;

    public AvoidGoal(Species[] species2Avoid) {
        avoidSpecies = species2Avoid;
    }

    @Override
    public void execute() {

    }
}