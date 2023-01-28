package net.rewindteam.historyrewind.behaviour.entity.goal;

import net.minecraft.core.BlockPos;
import net.rewindteam.historyrewind.entity.GeneralEntity;

public class GotoGoal extends Goal {

    BlockPos blockPos;

    public GotoGoal(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    @Override
    public void execute(GeneralEntity entity) {

    }

    @Override
    public boolean executeWithResult(GeneralEntity entity) {
        AvoidGoal avoidGoal = new AvoidGoal(entity.getSpecies().getSpecies2Avoid());
        avoidGoal.executeWithResult(entity);
        return true;
    }
}