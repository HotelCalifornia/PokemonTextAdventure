package src.main.java.engine;

import src.main.java.engine.creatures.AbstractCreature;

/**
 * This file created by Alex Brooke
 * please seek the author's permission before
 * distributing this software.
 * 'Do you know Java? Because your method body is sexy'
 * :3
 */
//this is the big one :0
public class Player {
    private AbstractCreature[] party = new AbstractCreature[6 ];
    public AbstractCreature[] getParty() { return party; }
    private AbstractCreature[] box   = new AbstractCreature[64];
    public AbstractCreature[] getBox() { return box; }
    public Player() {
        //is this really it?
    }
    public void addCreatureToPartyOrBox(AbstractCreature creature) {
        for(int i = 0; i < party.length; i++) {
            if(party[i] == null) {
                party[i] = creature;
                break;
            }
            if(i == party.length - 1 && party[i] != null) {
                for(int j = 0; i < box.length; i++) {
                    if(box[j] == null) {
                        box[j] = creature;
                        break;
                    }
                    if(j == box.length - 1 && box[j] != null) {
                        //what happens if the box is full? :o
                    }
                }
            }
        }
    }
    public int avgLevel() {
        int numInParty = 1;
        int levelCount = 0;
        for (AbstractCreature aParty : party) {
            if (aParty != null) {
                numInParty++;
                levelCount += aParty.calculateLVL();
            }
        }
        return levelCount/numInParty;
    }
}
