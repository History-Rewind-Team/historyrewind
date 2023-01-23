package net.rewindteam.historyrewind.entity.prehistory.cenozoic;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.species.CoelophysisSpecies;

public class CenozoicSpecies extends PrehistorySpecies {

    public static final CenozoicSpecies COELOPHYSIS = new CoelophysisSpecies();

    protected CenozoicSpecies(String name, Diet defaultDiet) {
        super(defaultDiet, Period.CENOZOIC, name);
    }
}