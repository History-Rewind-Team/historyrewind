package net.rewindteam.historyrewind.dimension;

public enum Period {
    PALEOZOIC,
    MESOZOIC,
    CENOZOIC,
    POST_APOCALYPTIC,
    FUTURE_REBUILD,
    FUTURE_WOI,
    NO_DINO_EXTINCTION,
    PAST_LIFE_MARS,
    NO_PERMIAN_EXTINCTION;

    public Class getPeriodClass() {
        return switch (this) {
            case PALEOZOIC, MESOZOIC, CENOZOIC -> Class.PREHISTORY;
            case POST_APOCALYPTIC, FUTURE_REBUILD, FUTURE_WOI -> Class.FUTURE;
            case NO_DINO_EXTINCTION, PAST_LIFE_MARS, NO_PERMIAN_EXTINCTION -> Class.ALTERNATE;
        };
    }

    public enum Class {
        PREHISTORY,
        FUTURE,
        ALTERNATE;
    }
}