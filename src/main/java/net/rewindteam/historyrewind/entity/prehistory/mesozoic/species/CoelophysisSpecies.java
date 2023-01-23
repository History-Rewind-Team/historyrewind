package net.rewindteam.historyrewind.entity.prehistory.mesozoic.species;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.prehistory.CompyBehaviour;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.MesozoicSpecies;

public class CoelophysisSpecies extends MesozoicSpecies {

    private static Species species;
    private static final Diet defaultDiet = new Diet(0.9f, 0.1f);
    private static Diet diet;
    private static CompyBehaviour behaviour;

    public CoelophysisSpecies() {
        super("Coelophysis", defaultDiet);
        species = Species.register(defaultDiet, Period.MESOZOIC, "Coelophysis");
    }

    public CoelophysisSpecies(Diet diet) {
        super();
        species = Species.register(diet, Period.MESOZOIC, "Coelophysis");
    }

    public Diet getDefaultDiet() {
        return defaultDiet;
    }
    
    public Species getSpecies() {
        return species;
    }
}