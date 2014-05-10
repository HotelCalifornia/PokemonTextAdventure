package src.main.java.engine.creatures;

/**
 * the superclass for all types of creatures
 * possible types of creatures:
 * gym creature
 * trainer creature
 * wild creature
 * (list may be expanded or compacted)
 */
public abstract class AbstractCreature {
    //the creature's type
    private EnumTypes type;
    public EnumTypes getType() { return type; }

    //stores the tier of this creature
    private int tier;
    public int getTier() { return tier; }

    //stores the experience of this creature
    private int experience;
    public int getExperience() { return experience; }

    /**
     * calculate the creature's level from its experience
     * for example:
     * experience = 900
     * int calculateLvl() {
     *     int x = (5 * experience) / 4
     *     return Math.pow(x, 1.0/3);
     * }
     * see @link http://bulbapedia.bulbagarden.net/wiki/Experience for more algorithms
     * @return the creature's level
     */
    public abstract int calculateLvl();

    /**
     * calculate the experience gained from defeating a pokemon in battle
     * @param isWild true if the other pokemon is wild (i.e. not a trainer-owned pokemon)
     * @param otherLevel the level of the opponent
     * @return
     * algorithm is modified from the one found on @link http://bulbapedia.bulbagarden.net/wiki/Experience
     */
    public int expGainedInBattle(boolean isWild, int otherLevel) {
        double mult;
        if(isWild) {
            mult = 1.0;
        }
        else {
            mult = 1.5;
        }
        return (int) ((mult * otherLevel) / 7);
    }

    public AbstractCreature(EnumTypes type, int tier, int baseExp) {
        this.type = type;
        this.tier = tier;
        this.experience = baseExp;
    }
}
