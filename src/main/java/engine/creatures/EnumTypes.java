package src.main.java.engine.creatures;

import java.util.HashMap;
import java.util.Map;

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
    Map<String, Integer> fireStats = new HashMap<String, Integer>();
    Map<String, Integer> waterStats = new HashMap<String, Integer>();
    Map<String, Integer> elecStats = new HashMap<String, Integer>();
    Map<String, Integer> grassStats = new HashMap<String, Integer>();
    Map<String, Integer> flyingStats = new HashMap<String, Integer>();
    Map<String, Integer> psychicStats = new HashMap<String, Integer>();
    Map<String, Integer> ghostStats = new HashMap<String, Integer>();
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
        if     (type1.fire==1     && type2  ==    FIRE) { return 1;  }
        else if(type1.water==1    && type2  ==   WATER) { return 1;  }
        else if(type1.elec==1     && type2  ==    ELEC) { return 1;  }
        else if(type1.grass==1    && type2  ==   GRASS) { return 1;  }
        else if(type1.flying==1   && type2  ==  FLYING) { return 1;  }
        else if(type1.psychic==1  && type2  == PSYCHIC) { return 1;  }
        else if(type1.ghost==1    && type2  ==   GHOST) { return 1;  }
        else if(type1.fire==-1    && type2  ==    FIRE) { return -1; }
        else if(type1.water==-1   && type2  ==   WATER) { return -1; }
        else if(type1.elec==-1    && type2  ==    ELEC) { return -1; }
        else if(type1.grass==-1   && type2  ==   GRASS) { return -1; }
        else if(type1.flying==-1  && type2  ==  FLYING) { return -1; }
        else if(type1.psychic==-1 && type2  == PSYCHIC) { return -1; }
        else if(type1.ghost==-1   && type2  ==   GHOST) { return -1; }

        else                                            { return 0;  }
    }

    private void initMaps() {
        //this is how you associate the stat with its value
        fireStats.put("HP", 30);
        fireStats.put("ATK", 50);
        fireStats.put("DEF", 40);
        waterStats.put("HP", 30);
        waterStats.put("ATK", 40);
        waterStats.put("DEF", 50);
        grassStats.put("HP", 50);
        grassStats.put("ATK", 30);
        grassStats.put("DEF", 40);
        elecStats.put("HP", 20);
        elecStats.put("ATK", 60);
        elecStats.put("DEF", 40);
        flyingStats.put("HP", 20);
        flyingStats.put("ATK", 30);
        flyingStats.put("DEF", 60);
        psychicStats.put("HP", 10);
        psychicStats.put("ATK", 70);
        psychicStats.put("DEF", 20);
        ghostStats.put("HP", 20);
        ghostStats.put("ATK", 10);
        ghostStats.put("DEF", 70);
    }

    //precondition: @param stat will be one of either "HP", "ATK", or "DEF"
    public int getStatForType(EnumTypes type, String stat) {
        //check for the type, return the appropriate stat from the stat Map
        if(type == FIRE) {
            return fireStats.get(stat);
        }
        if(type == WATER){
            return waterStats.get(stat);
        }
        if(type == GRASS){
            return grassStats.get(stat);
        }
        if(type == ELEC){
            return elecStats.get(stat);
        }
        if(type == FLYING){
            return flyingStats.get(stat);
        }
        if(type == PSYCHIC){
            return psychicStats.get(stat);
        }
        if(type == GHOST){
            return ghostStats.get(stat);
        }
        return 0;
    }

}
