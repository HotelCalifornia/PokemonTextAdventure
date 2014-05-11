package src.main.java.engine.creatures;


/**
 * the superclass for all types of creatures
 * possible types of creatures:
 * gym creature
 * trainer creature
 * wild creature
 * (list may be expanded or compacted)
 */
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public abstract class AbstractCreature {
    //the creature's type
    protected EnumTypes type;
    public EnumTypes getType() { return type; }

    //stores the tier of this creature
    protected int tier;
    public int getTier() { return tier; }

    //stores the experience of this creature
    protected int experience;
    public int getExperience() { return experience; }

    //stores the creature's current HP. not to be confused with the HP stat
    protected int HP;
    public int getHP() { return HP; }

    /* stats */
    //stores the HP stat of this creature
    protected int HPStat;
    //stores the ATK stat of this creature
    protected int ATKStat;
    //stores the DEF stat of this creature
    protected int DEFStat;

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
    public abstract int calculateLVL();

    /**
     * calculate the experience gained from defeating a pokemon in battle
     * @param isWild true if the other pokemon is wild (i.e. not a trainer-owned pokemon)
     * @param otherLevel the level of the opponent
     * @return the amount of experience the creature gained
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

    /**
     * calculate the damage dealt by this creature to another in battle
     * as per the formula:
     * damage = (((2 * level + 10) / 250) * (attack / defense) * power + 2) * modifier, where
     * level = this creature's level
     * attack = the attack stat of this creature
     * defense = the defense stat of the opponent
     * power = the attack power of the move being used
     * and
     * modifier = type * random * critical, where
     * type = 2 if this creature's type is super-effective over the opponent's, 1 if not
     * random = 0.85 + Math.random() * 1.15 (random number between 0.85 and 1)
     * and
     * critical = ((2 * L + 5)/(L + 5)), where
     * L = this creature's level
     * and the chance for a critical = 1/16
     * @param otherType the type of the other creature
     * @param otherDEFStat the defense stat of the other creature
     * @param movePower the power of this move
     * @return the damage dealt
     */
    public int damageDealt(EnumTypes otherType, int otherDEFStat, int movePower) {
        int effectiveMult = 1;
        //determine the multiplier for type effectiveness
        if(EnumTypes.isEffective(this.type, otherType) == 1) {
            effectiveMult = 2;
        }
        //calculate the chance for a critical hit (1/16)
        int critChance = 1 + (int)(Math.random() * 16);
        double critDMG = 1.0;
        //if the move is a critical, apply the critical hit multiplier
        if(critChance == 1) {
            critDMG = ((2 * this.calculateLVL() + 5)/(this.calculateLVL()+ 5));
        }
        //calculate the damage multiplier
        double mult = effectiveMult * critDMG * (0.85 + Math.random() * 1.15);
        //return the damage * the damage multiplier
        return (int)((((2 * this.calculateLVL() + 10) / 250) * (this.ATKStat / otherDEFStat) * movePower + 2) * mult);
    }

    //self-explanatory; use expGainedInBattle to get @param exp
    protected void addExp(int exp) {
        this.experience += exp;
    }

    public AbstractCreature(EnumTypes type, int tier) {
        this.type = type;
        this.tier = tier;
        this.experience = getExpFromTier(tier);
    }

    /**
     * get the current experience amount from the given tier.
     * this can be implemented in a number of ways, depending on how in-depth
     * we want to go with the tier/levelling system
     * @param tier the tier of the creature
     * @return the current experience of the creature
     */
    protected abstract int getExpFromTier(int tier);
}
