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
import net.rewindteam.historyrewind.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    static String MODID = HistoryRewind.MODID;

    //All the dimensions should have their own block DeferredRegister
    public static final DeferredRegister<Block> FUTURE = newDeferredRegister();
    public static final DeferredRegister<Block> WHAT_IF = newDeferredRegister();
    public static final DeferredRegister<Block> PREHISTORY = newDeferredRegister();

    //This is going to get long!
    public static final RegistryObject<Block> MOON_ROCK = registerBlock(FUTURE, "moon_rock", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> CORE_BLOCK = registerBlock(FUTURE, "core_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)));


    //These two methods make registering BlockItems (or not) a lot easier
    private static RegistryObject<Block> registerBlock(DeferredRegister<Block> deferredRegister, String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = deferredRegister.register(name, supplier);
        ModItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static RegistryObject<Block> registerWithoutItem(DeferredRegister<Block> deferredRegister, String name, Supplier<? extends Block> supplier) {
        return deferredRegister.register(name, supplier);
    }

    //This avoids repetitive code at the top
    public static DeferredRegister<Block> newDeferredRegister() {
        return DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    }

    //TODO Could someone please find a way to avoid rewriting all of the DeferredRegisters here?
    public static void registerAll(IEventBus bus) {
        FUTURE.register(bus);
        WHAT_IF.register(bus);
        PREHISTORY.register(bus);
    }
}