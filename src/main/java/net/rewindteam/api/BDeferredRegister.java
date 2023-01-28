package net.rewindteam.api;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.historyrewind.HistoryRewind;

import java.util.LinkedList;
import java.util.Objects;
import java.util.function.Supplier;

public class BDeferredRegister<T> {

    static LinkedList<?> list = new LinkedList<>();
    DeferredRegister<? extends T> defReg;

    @SuppressWarnings("unchecked")
    private BDeferredRegister(IForgeRegistry<?> type) {
        defReg = (DeferredRegister<? extends T>) DeferredRegister.create(type, HistoryRewind.MODID);
    }

    @SuppressWarnings("")
    public static <T> BDeferredRegister<T> create(IForgeRegistry<?> type) {
        return new BDeferredRegister<>(type);
    }

    public <Y extends T> RegistryObject<Y> register(String name, Supplier<? extends Y> supplier) {
        return (RegistryObject<Y>) defReg.register(name, supplier).orElse(null);
    }
}