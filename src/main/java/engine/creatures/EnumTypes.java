package src.main.java.engine.creatures;

/**
 * contains the possible types of creatures
 */
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
//TODO determine if we want to keep type-effectiveness a boolean value
public enum EnumTypes {
    FIRE(false, false, false, false, false, false, false),
    WATER(false, false, false, false, false, false, false),
    ELEC(false, false, false, false, false, false, false),
    GRASS(false, false, false, false, false, false, false),
    FLYING(false, false, false, false, false, false, false),
    PSYCHIC(false, false, false, false, false, false, false),
    GHOST(false, false, false, false, false, false, false);

    boolean fire;
    boolean water;
    boolean elec;
    boolean grass;
    boolean flying;
    boolean psychic;
    boolean ghost;

    EnumTypes(boolean fire, boolean water, boolean elec, boolean grass, boolean flying, boolean psychic, boolean ghost) {

    }
    static int isEffective(EnumTypes type1, EnumTypes type2) {
        if     (type1.fire    && type2  ==    FIRE) { return 1; }
        else if(type1.water   && type2  ==   WATER) { return 1; }
        else if(type1.elec    && type2  ==    ELEC) { return 1; }
        else if(type1.grass   && type2  ==   GRASS) { return 1; }
        else if(type1.flying  && type2  ==  FLYING) { return 1; }
        else if(type1.psychic && type2  == PSYCHIC) { return 1; }
        else if(type1.ghost   && type2  ==   GHOST) { return 1; }
        else                                        { return 0; }
    }

}
