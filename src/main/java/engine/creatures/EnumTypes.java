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
        /**
         * each int stores the relative effectiveness of the type on another type.
         * so, if type.fire == 1, it's supereffective against fire
         * type.fire == 0 means there's normal efffectiveness (no multiplier)
         * and type.fire == -1 means it deals half damage against fire (not very effective)
         * so, this method should make the appropriate comparisons as such
         * if(type1.fire == 1 && type2 == FIRE) { return 1; }
         */
        if     (type1.fire==1    && type2  ==    FIRE) { return 1; }
        else if(type1.water==1   && type2  ==   WATER) { return 1; }
        else if(type1.elec==1    && type2  ==    ELEC) { return 1; }
        else if(type1.grass==1   && type2  ==   GRASS) { return 1; }
        else if(type1.flying==1  && type2  ==  FLYING) { return 1; }
        else if(type1.psychic==1 && type2  == PSYCHIC) { return 1; }
        else if(type1.ghost==1   && type2  ==   GHOST) { return 1; }
        else if(type1.fire==-1 && type2 == FIRE) {return -1;}
        else if(type1.water==-1   && type2  ==   WATER) { return -1; }
        else if(type1.elec==-1    && type2  ==    ELEC) { return -1; }
        else if(type1.grass==-1   && type2  ==   GRASS) { return -1; }
        else if(type1.flying==-1  && type2  ==  FLYING) { return -1; }
        else if(type1.psychic==-1 && type2  == PSYCHIC) { return -1; }
        else if(type1.ghost==-1   && type2  ==   GHOST) { return -1; }

        else                                        { return 0; }
    }

}
