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
import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class ItemRegHelper extends GeneralRegHelper {

    static DeferredRegister<Item> ITEMS;


    public static RegistryObject<Item> registerItem(String name, Supplier<? extends Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static DeferredRegister<Item> newDeferredRegister() {
        ITEMS = (DeferredRegister<Item>) newRegister(ForgeRegistries.ITEMS);
        return ITEMS;
    }

    @SuppressWarnings("all")
    public static DeferredRegister<Item> getAll() {
        try {
            Class<?> caller = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            Method addMethod = caller.getSuperclass().getDeclaredMethod("addRegister");
            addMethod.invoke(addMethod, ITEMS);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException e) {
            HistoryRewind.LOGGER.warn(e.getMessage());
            for(int i = 0; i < e.getStackTrace().length; i++) {
                HistoryRewind.LOGGER.trace(String.valueOf(e.getStackTrace()[i]));
            }
        }
        return ITEMS;
    }
}