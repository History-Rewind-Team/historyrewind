package net.rewindteam.historyrewind.entity.prehistory;

import com.electronwill.nightconfig.core.conversion.SpecClassInArray;
import net.rewindteam.historyrewind.behaviour.entity.Diet;
import net.rewindteam.historyrewind.dimension.Period;
import net.rewindteam.historyrewind.entity.Species;
import net.rewindteam.historyrewind.entity.SpeciesBuilder;
import net.rewindteam.historyrewind.entity.SpeciesEnum;

import static net.rewindteam.historyrewind.entity.prehistory.PrehistorySpecies.Mesozoic.COMPY;

public class PrehistorySpecies extends Species {

    public static Period PALEOZOIC = Period.PALEOZOIC;
    public static Period MESOZOIC = Period.MESOZOIC;
    public static Period CENOZOIC = Period.CENOZOIC;

    public PrehistorySpecies(Diet defaultDiet, Period period, String name) {
        super(defaultDiet, period, name);
    }

    public enum Paleozoic {

    }

    public enum Mesozoic {
        COMPY;
    }

    public enum Cenozoic {

    }
}