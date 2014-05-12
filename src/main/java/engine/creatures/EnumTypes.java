package src.main.java.engine.creatures;

/**
 * contains the possible types of creatures
 */
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
//TODO determine if we want to keep type-effectiveness a boolean value
public enum EnumTypes {
    FIRE(0, 0, 0, 0, 0, 0, 0),
    WATER(0, 0, 0, 0, 0, 0, 0),
    ELEC(0, 0, 0, 0, 0, 0, 0),
    GRASS(0, 0, 0, 0, 0, 0, 0),
    FLYING(0, 0, 0, 0, 0, 0, 0),
    PSYCHIC(0, 0, 0, 0, 0, 0, 0),
    GHOST(0, 0, 0, 0, 0, 0, 0);

    int fire;
    int water;
    int elec;
    int grass;
    int flying;
    int psychic;
    int ghost;

    EnumTypes(int fire, int water, int elec, int grass, int flying, int psychic, int ghost) {

    }
    static int isEffective(EnumTypes type1, EnumTypes type2) {
        if     (type1.fire    && type2  ==    FIRE) { return 0; }
        else if(type1.water   && type2  ==   WATER) { return 0; }
        else if(type1.elec    && type2  ==    ELEC) { return 0; }
        else if(type1.grass   && type2  ==   GRASS) { return 0; }
        else if(type1.flying  && type2  ==  FLYING) { return 0; }
        else if(type1.psychic && type2  == PSYCHIC) { return 0; }
        else if(type1.ghost   && type2  ==   GHOST) { return 0; }
        else                                        { return 0; }
    }

}
