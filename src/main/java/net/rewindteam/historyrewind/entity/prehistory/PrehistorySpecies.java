package net.rewindteam.historyrewind.entity.prehistory;

import com.electronwill.nightconfig.core.conversion.SpecClassInArray;
import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.entity.SpeciesBuilder;
import net.rewindteam.historyrewind.entity.SpeciesEnum;

public class PrehistorySpecies extends Species {

    public static Species[] MESOZOIC_SPECIES;

    public PrehistorySpecies(EntityBehaviour behaviour, Period period, String name) {
        super(behaviour, period, name);
    }
}