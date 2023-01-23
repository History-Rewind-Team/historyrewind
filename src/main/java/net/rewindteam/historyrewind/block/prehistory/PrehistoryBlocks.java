package net.rewindteam.historyrewind.block.prehistory;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;
import net.rewindteam.api.BlockRegistry;

public class PrehistoryBlocks extends BlockRegistry {

    private static RegistryObject<Block> BUSH = registerBlock("bush", () ->
            new Block(BlockBehaviour.Properties.of(Material.LEAVES)));
}