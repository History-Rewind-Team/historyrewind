package net.rewindteam.historyrewind.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.api.IndexableMap;
import net.rewindteam.historyrewind.HistoryRewind;
import net.rewindteam.historyrewind.block.future.FutureBlocks;
import net.rewindteam.historyrewind.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    static String MODID = HistoryRewind.MODID;

    public static IndexableMap<DeferredRegister<Block>, Character> allRegisters = new IndexableMap<>();

    //All the dimensions should have their own block DeferredRegister
    public static final DeferredRegister<Block> FUTURE = FutureBlocks.getAll();
    public static final DeferredRegister<Block> ALTERNATE = newDeferredRegister();
    public static final DeferredRegister<Block> PREHISTORY = newDeferredRegister();


    //This avoids repetitive code at the top
    public static DeferredRegister<Block> newDeferredRegister() {
        return DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    }

    public static void registerAll(IEventBus bus) {
        for(int i = 0; i <= allRegisters.size(); i++) {
            allRegisters.getKeyAt(i).register(bus);
        }
    }
}