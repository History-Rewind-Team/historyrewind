package net.rewindteam.historyrewind.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.historyrewind.item.ModItems;

import java.util.function.Supplier;

public class BlockRegHelper {

    public static RegistryObject<Block> registerBlock(DeferredRegister<Block> deferredRegister, String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = deferredRegister.register(name, supplier);
        ModItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static RegistryObject<Block> registerBlockWithoutItem(DeferredRegister<Block> deferredRegister, String name, Supplier<? extends Block> supplier) {
        return deferredRegister.register(name, supplier);
    }
}