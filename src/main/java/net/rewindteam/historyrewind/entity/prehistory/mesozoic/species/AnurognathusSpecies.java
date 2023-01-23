package net.rewindteam.historyrewind.entity.prehistory.mesozoic.species;

import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.entity.prehistory.mesozoic.MesozoicSpecies;

public class AnurognathusSpecies extends MesozoicSpecies {

    private static final Diet defaultDiet = new Diet(0.9f, 0.1f);
    private static Species species;

    protected AnurognathusSpecies() {
        super("Anurognathus", defaultDiet);
        species
    }
}