package net.rewindteam.historyrewind.entity.prehistory.cenozoic.species;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.species.CoelophysisSpecies;

public class CenozoicSpecies extends PrehistorySpecies {

    protected CenozoicSpecies(String name, EntityBehaviour defaultBehaviour) {
        super(defaultBehaviour, Period.CENOZOIC, name);
    }
}