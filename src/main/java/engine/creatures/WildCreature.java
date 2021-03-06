package src.main.java.engine.creatures;
import src.main.java.engine.IAI;

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
        return (int)Math.pow(x, 1.0/3);
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
    }

    @Override
    public void retreat() {
        //end the battle
    }
}
