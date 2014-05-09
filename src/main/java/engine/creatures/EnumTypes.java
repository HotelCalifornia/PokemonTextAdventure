package src.main.java.engine.creatures;

/**
 * contains the possible types of creatures
 */
public enum EnumTypes {
    FIRE(false, false, false, false, false, false, false),
    WATER(false, false, false, false, false, false, false),
    ELEC(false, false, false, false, false, false, false),
    GRASS(false, false, false, false, false, false, false),
    FLYING(false, false, false, false, false, false, false),
    PSYCHIC(false, false, false, false, false, false, false),
    GHOST(false, false, false, false, false, false, false);

    EnumTypes(boolean fire, boolean water, boolean elec, boolean grass, boolean flying, boolean psychic, boolean ghost) {

    }

}
