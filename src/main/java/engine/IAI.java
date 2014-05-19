package src.main.java.engine;

import src.main.java.engine.creatures.EnumTypes;
import src.main.java.engine.creatures.Moves;

public interface IAI {
    /**
     * returns the best move for the situation given the types of the creatures in battle.
     * A sample algorithm is thus:
     * check thisType in comparison to otherType
     * if this type is supereffective over the other, use a random move
     * else, if this type has no advantage or disadvantage, use the most powerful move
     * otherwise, this creature is at a disadvantage, and depending on the AI's difficulty, you could do
     * one of a couple things: switch to a different creature, attempt to run away, or keep going with the attack
     * @param thisType the type of the creature using the move
     * @param otherType the type of the opponent's creature
     * @return the best move to use
     */
    Moves bestMove(EnumTypes thisType, EnumTypes otherType);
    
    /**
     * uses the move selected by bestMove(), i.e.
     * apply damage and effects to the opponent
     * @param other the other creature in battle
     * @param the move that will be used
     */
    void useMove(AbstractCreature other, Move move);
    
    /**
     * determines what happens when the creature retreats runs away or is switched out by a trainer),
     * for instance, if the creature is wild, the battle is over
     */
    void retreat();
}
