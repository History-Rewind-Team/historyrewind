package net.rewindteam.historyrewind;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rewindteam.historyrewind.block.ModBlocks;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.handler.ServerEventHandler;
import net.rewindteam.historyrewind.item.ModItems;
import org.slf4j.Logger;

@Mod(HistoryRewind.MODID)
public class HistoryRewind {

    public static final String MODID = "historyrewind";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HistoryRewind() {
        //On initialise
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ModBlocks.registerAll(modEventBus);
        ModItems.registerAll(modEventBus);

        Species.buildMap();

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ServerEventHandler());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("History Rewind common setup initialising!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("[DEBUG] History Rewind detected server starting!");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("[DEBUG] History Rewind detected client setup!");
            LOGGER.info("INSTANCE NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}