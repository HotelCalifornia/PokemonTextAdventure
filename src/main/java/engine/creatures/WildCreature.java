package src.main.java.engine.creatures;
import src.main.java.engine.IAI;
import src.main.java.engine.creatures.AbstractCreature;
import src.main.java.engine.creatures.EnumTypes;
import src.main.java.engine.creatures.Moves;

public class WildCreature extends AbstractCreature implements IAI {
    public WildCreature(EnumTypes type, int experience, String name) {
        super(type, experience, name);
    }

    @Override
    public int calculateLVL() {
        return 0;
    }

    @Override
    public int calculateEXP() {
        int x = (5 * experience) / 4;
        Math.pow()
    }

    @Override
    public Moves bestMove(EnumTypes thisType, EnumTypes otherType) {
        if(EnumTypes.isEffective(thisType, otherType) == 1) {
            int t = Integer.MAX_VALUE;
            int j = 0;
            for(int i = 0; i < moves.size(); i++) {
                if(moves.get(i).getDamage() < t) {
                    t = moves.get(i).getDamage();
                    j  = i;
                }
            }
            return moves.get(j);
        }
        else {
            int t = Integer.MIN_VALUE;
            int j = 0;
            for(int i = 0; i < moves.size(); i++) {
                if(moves.get(i).getDamage() > t) {
                    t = moves.get(i).getDamage();
                    j = i;
                }
            }
            return moves.get(j);
        }
    }

    @Override
    public void useMove(AbstractCreature other, Moves move) {
        other.setHP(other.getHP() - damageDealt(other.getType(), other.getDEFStat(), move.getDamage()));
        if(this.HP <= 0) {
            //end the battle
        }
    }

    @Override
    public void retreat() {
        //end the battle
    }
}
