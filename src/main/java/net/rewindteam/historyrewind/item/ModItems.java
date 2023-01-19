package net.rewindteam.historyrewind.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.historyrewind.HistoryRewind;

public class ModItems {

    static String MODID = HistoryRewind.MODID;

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);





    public static void registerAll(IEventBus bus) {
        TOOLS.register(bus);
        BLOCK_ITEMS.register(bus);
    }
}