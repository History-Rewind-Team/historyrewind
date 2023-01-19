package net.rewindteam.historyrewind.block.future.custom;

import net.minecraft.world.level.block.Block;

public class CoreBlock extends Block {

    private static boolean activated;
    private static float energy;

    public CoreBlock(Properties p_49795_) {
        super(p_49795_);
        activated = false;
    }

    public static void tick() {
        if(activated) {
            energy = energy + 0.1f;
        }
    }

    public static void activate() {
        activated = true;
    }

    public static float getEnergy() {
        return energy;
    }
}