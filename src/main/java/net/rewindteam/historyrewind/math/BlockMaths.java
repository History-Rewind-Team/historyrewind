package net.rewindteam.historyrewind.math;

import net.minecraft.core.BlockPos;
import net.rewindteam.api.IndexableMap;

public class BlockMaths {

    public static IndexableMap<BlockPos, Integer> getPositionsInCircle(BlockPos center, int radius) {
        IndexableMap<BlockPos, Integer> positions = new IndexableMap<>();
        BlockPos xMost;
        BlockPos yMost;
        BlockPos zMost;
        //North, south, east and west
        for(int i = 1; i < radius; i++) {
            for(int j = 0; j < (radius / 2); j++) {
                positions.put(center.offset(i, 0, j), i + j);
            }

            for(int j = -1; j > -(radius / 2); j++) {
                positions.put(center.offset(i, 0, j), i + j);
            }
        }
        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(0, i, 0), i);
        }

        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(0, 0, i), i);
        }

        //All diagonals
        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(i, 0, i), i);
        }

        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(-i, 0, -i), i);
        }

        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(i, 0, -i), i);
        }

        for(int i = 1; i < radius; i++) {
            positions.put(center.offset(-i, 0, i), i);
        }

        return positions;
    }
}