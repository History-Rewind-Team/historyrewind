package net.rewindteam.api;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.historyrewind.HistoryRewind;
import net.rewindteam.historyrewind.item.ModItems;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class BlockRegHelper extends GeneralRegHelper {

    static DeferredRegister<Block> BLOCKS;

    public static RegistryObject<Block> registerBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static RegistryObject<Block> registerBlockWithoutItem(String name, Supplier<? extends Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public static DeferredRegister<Block> newDeferredRegister() {
        BLOCKS = (DeferredRegister<Block>) newRegister(ForgeRegistries.BLOCKS);
        return BLOCKS;
    }

    @SuppressWarnings("all")
    public static DeferredRegister<Block> getAll() {
        try {
            Class<?> caller = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            Method addMethod = caller.getSuperclass().getDeclaredMethod("addRegister");
            addMethod.invoke(addMethod, BLOCKS);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException e) {
            HistoryRewind.LOGGER.warn(e.getMessage());
            for(int i = 0; i < e.getStackTrace().length; i++) {
                HistoryRewind.LOGGER.trace(String.valueOf(e.getStackTrace()[i]));
            }
        }
        return BLOCKS;
    }
}