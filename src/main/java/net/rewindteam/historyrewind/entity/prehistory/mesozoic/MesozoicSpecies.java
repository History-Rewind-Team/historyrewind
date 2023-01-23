package net.rewindteam.historyrewind.entity.prehistory.mesozoic;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.species.CoelophysisSpecies;

@SuppressWarnings("all")
public class MesozoicSpecies extends PrehistorySpecies {

    public static final MesozoicSpecies COELOPHYSIS = new CoelophysisSpecies();
    public static final MesozoicSpecies ANUROGNATHUS = new CoelophysisSpecies();
    public static final MesozoicSpecies HYBODUS = new CoelophysisSpecies();

    protected MesozoicSpecies(String name, Diet defaultDiet) {
        super(defaultDiet, Period.CENOZOIC, name);
    }

}