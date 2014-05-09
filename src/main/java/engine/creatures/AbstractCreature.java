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



}
