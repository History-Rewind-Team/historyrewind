package net.rewindteam.historyrewind.entity.prehistory.mesozoic.species;

import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies;

@SuppressWarnings("all")
public class MesozoicSpecies extends PrehistorySpecies {

    public static final MesozoicSpecies COELOPHYSIS = new CoelophysisSpecies();
    public static final MesozoicSpecies ANUROGNATHUS = new AnurognathusSpecies();
    public static final MesozoicSpecies HYBODUS = new CoelophysisSpecies();

    protected MesozoicSpecies(String name, EntityBehaviour behaviour) {
        super(behaviour, Period.MESOZOIC, name);
    }
}