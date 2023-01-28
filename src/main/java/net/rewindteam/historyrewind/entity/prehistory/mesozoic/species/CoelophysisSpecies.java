package net.rewindteam.historyrewind.entity.prehistory.mesozoic.species;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.prehistory.CompyBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.Species;

public class CoelophysisSpecies extends MesozoicSpecies {

    private static Species species;
    private static final Diet defaultDiet = new Diet(0.9f, 0.1f);
    private static final CompyBehaviour defaultBehaviour = new CompyBehaviour(defaultDiet);

    public CoelophysisSpecies() {
        super("Coelophysis", defaultBehaviour);
        species = Species.register(defaultBehaviour, Period.MESOZOIC, "Coelophysis");
    }

    public Diet getDefaultDiet() {
        return defaultDiet;
    }
    
    public Species getSpecies() {
        return species;
    }
}