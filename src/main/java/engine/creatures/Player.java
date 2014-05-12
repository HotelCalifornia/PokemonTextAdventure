package src.main.java.engine.creatures;

/**
 * This file handles the player's info (team, progress, etc.)
 */
@SuppressWarnings("unused")
public class Player {
    //stores the player's current team
    private AbstractCreature[] team = new AbstractCreature[5];

    //stores the creatures in the player's PC
    private AbstractCreature[] pc   = new AbstractCreature[63];

    //stores the number of badges the player has
    public int badges = 0;

    public Player() {

    }
}
