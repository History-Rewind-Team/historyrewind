package net.rewindteam.historyrewind.handler;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.rewindteam.historyrewind.block.future.custom.CoreBlock;

public class ServerEventHandler {
    @SubscribeEvent
    public void onTick() {
        CoreBlock.tick();
    }
}