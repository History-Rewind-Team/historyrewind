package net.rewindteam.historyrewind.entity.prehistory.mesozoic;

import net.minecraft.core.BlockPos;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.GeneralEntity;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.species.CoelophysisSpecies;

public class CoelophysisEntity extends GeneralEntity {

    public CoelophysisEntity(BlockPos blockPos) {
        super(Species.getSpecies(Period.MESOZOIC, "Coelophysis").getDefaultBehaviour());
        this.position = blockPos;
    }
}