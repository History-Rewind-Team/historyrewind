package net.rewindteam.historyrewind.block.future;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.api.BlockRegHelper;

public class FutureBlocks extends BlockRegHelper {


    private static final DeferredRegister<Block> BLOCKS = newDeferredRegister();

    private static final RegistryObject<Block> ENERGY_FRAME = registerBlock("energy_frame", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)));
    private static final RegistryObject<Block> MOON_ROCK = registerBlock("moon_rock", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE)));
}