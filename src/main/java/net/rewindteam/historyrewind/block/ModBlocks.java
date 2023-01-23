package net.rewindteam.historyrewind.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.rewindteam.api.BlockRegistry;
import net.rewindteam.api.GeneralRegHelper;
import net.rewindteam.historyrewind.HistoryRewind;
import net.rewindteam.historyrewind.block.alternate.AlternateBlocks;
import net.rewindteam.historyrewind.block.future.FutureBlocks;
import net.rewindteam.historyrewind.block.prehistory.PrehistoryBlocks;

public class ModBlocks extends GeneralRegHelper {

    //All the dimensions should have their own block DeferredRegister
    public static final BlockRegistry FUTURE = FutureBlocks;
    public static final DeferredRegister<Block> ALTERNATE = AlternateBlocks.getAll();
    public static final DeferredRegister<Block> PREHISTORY = PrehistoryBlocks.getAll();

    public static void hi() {

    }
}