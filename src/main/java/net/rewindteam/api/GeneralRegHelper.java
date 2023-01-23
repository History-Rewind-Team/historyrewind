package net.rewindteam.api;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.rewindteam.historyrewind.HistoryRewind;

@SuppressWarnings("unused")
public class GeneralRegHelper {

    static String MODID = HistoryRewind.MODID;

    static int allRegNum = 0;
    public static DeferredRegister<?>[] allRegisters;

    public static void addRegister(DeferredRegister<?> register) {
        allRegisters[allRegNum] = register;
        allRegNum++;
    }

    public static void registerAll(IEventBus bus) {
        for (DeferredRegister<?> allRegisters : allRegisters) {
            allRegisters.register(bus);
        }
    }

    public static DeferredRegister<?> newRegister(IForgeRegistry<?> type) {
        return DeferredRegister.create(type, MODID);
    }
}