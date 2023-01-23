package net.rewindteam.historyrewind.entity;

import net.rewindteam.api.ArrayManipulator;
import net.rewindteam.api.IndexableMap;
import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.behaviour.entity.EntityBehaviour;
import net.rewindteam.historyrewind.dimension.Period;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Species extends SpeciesBuilder {

    static IndexableMap<Period, Species[]> periodSpecies = new IndexableMap<>();
    static ArrayManipulator<Species> arrayManipulator = new ArrayManipulator<>();

    Species[] species2Avoid;

    String name;
    Diet defaultDiet;

    protected Species(Diet defaultDiet, Period period, String name) {
        super(defaultDiet);
        Species[] speciesInPeriod = periodSpecies.get(period);
        assert speciesInPeriod != null;
        boolean alreadyExists = false;
        for (Species species : speciesInPeriod) {
            if (species.name.equals(name)) {
                alreadyExists = true;
                break;
            }
        }
        if(!alreadyExists)
            periodSpecies.replace(period, arrayManipulator.addElement(speciesInPeriod,
                    new Species(defaultDiet, name)));
    }

    public static Species register(Diet defaultDiet, Period period, String name) {
        return new Species(defaultDiet, period, name);
    }

    public Species[] getSpecies2Avoid() {
        return this.species2Avoid;
    }

    private Species(Diet defaultDiet, String name) {
        super(defaultDiet);
        this.name = name;
    }

    private Species(Diet defaultDiet, String name, EntityBehaviour behaviour) {
        super(defaultDiet, behaviour);
        this.name = name;
    }

    public Period getPeriod() {
        for (Period period : Period.values()) {
           Species[] speciesInPeriod = periodSpecies.get(period);
           for(int i = 0; i < speciesInPeriod.length; i++) {
               if(speciesInPeriod[i].name.equals(this.name))
                   return period;
           }
        }
        return null;
    }

    public static void buildMap() {
        periodSpecies.put(Period.PALEOZOIC, null);
        periodSpecies.put(Period.MESOZOIC, null);
        periodSpecies.put(Period.CENOZOIC, null);
        periodSpecies.put(Period.POST_APOCALYPTIC, null);
        periodSpecies.put(Period.FUTURE_REBUILD, null);
        periodSpecies.put(Period.FUTURE_WOI, null);
        periodSpecies.put(Period.NO_DINO_EXTINCTION, null);
        periodSpecies.put(Period.PAST_LIFE_MARS, null);
        periodSpecies.put(Period.NO_PERMIAN_EXTINCTION, null);
    }

    public static Species[] in(Period period) {
        return periodSpecies.get(period);
    }

    public float getCarnivorousWeight() {
        return this.defaultDiet.carnivorousWeight;
    }

    public float getHerbivorousWeight() {
        return this.defaultDiet.herbivorousWeight;
    }

    public static Species getSpecies(Period period, String name) {
        Species species = null;
        Species[] speciesInPeriod = periodSpecies.get(period);
        for (Species value : speciesInPeriod) {
            if (value.name.equals(name)) {
                species = value;
                break;
            }
        }
        return species;
    }

    @Override
    public Diet getDiet() {
        return this.defaultDiet;
    }
}