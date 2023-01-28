package net.rewindteam.historyrewind.behaviour.entity.goal;

import net.rewindteam.historyrewind.entity.GeneralEntity;
import net.rewindteam.historyrewind.entity.Species;

public class AvoidGoal extends Goal {

    Species[] avoidSpecies;

    public AvoidGoal(Species[] species2Avoid) {
        avoidSpecies = species2Avoid;
    }

    @Override
    public void execute(GeneralEntity entity) {

    }

    @Override
    public boolean executeWithResult(GeneralEntity entity) {
        return true;
    }
}