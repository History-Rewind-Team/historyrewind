package net.rewindteam.historyrewind.block.future;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.historyrewind.block.BlockRegHelper;
import net.rewindteam.historyrewind.block.ModBlocks;

import java.util.function.Supplier;

public class FutureBlocks extends BlockRegHelper {

    private static final DeferredRegister<Block> BLOCKS = ModBlocks.newDeferredRegister();

    private static final RegistryObject<Block> ENERGY_FRAME = registerBlock(BLOCKS,
            "energy_frame", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> MOON_ROCK = registerBlock(BLOCKS, "moon_rock", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE)));

    public static DeferredRegister<Block> getAll() {
        ModBlocks.allRegisters.put(BLOCKS, 'a');
        return BLOCKS;
    }
}