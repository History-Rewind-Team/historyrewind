package net.rewindteam.historyrewind.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.api.GeneralRegHelper;
import net.rewindteam.historyrewind.HistoryRewind;
import net.rewindteam.historyrewind.item.alternate.AlternateItems;

public class ModItems extends GeneralRegHelper {

    static String MODID = HistoryRewind.MODID;

    public static final DeferredRegister<Item> ALTERNATE = AlternateItems.getAll();
    public static final DeferredRegister<Item> FUTURE = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

}