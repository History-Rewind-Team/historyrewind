package net.rewindteam.historyrewind.behaviour.entity.goal;

import net.rewindteam.historyrewind.entity.GeneralEntity;

public abstract class Goal {

    public abstract void execute(GeneralEntity entity);
    public abstract boolean executeWithResult(GeneralEntity entity);
}