package src.main.java.engine.creatures;
import src.main.java.engine.IAI;
import src.main.java.engine.creatures.AbstractCreature;
import src.main.java.engine.creatures.EnumTypes;
import src.main.java.engine.creatures.Moves;

public class WildCreature extends AbstractCreature implements IAI {
  public WildCreature(int experience) {}

    @Override
    public int calculateLVL() {
        return 0;
    }

    @Override
    protected int getExpFromTier(int tier) {
        return 0;
    }

    @Override
    public Moves bestMove(EnumTypes thisType, EnumTypes otherType) {
        return null;
    }

    @Override
    public void useMove(AbstractCreature other, Moves move) {

    }

    @Override
    public void retreat() {

    }
}
