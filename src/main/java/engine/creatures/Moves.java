package src.main.java.engine.creatures;

/**
 * Created by 618616 on 5/16/2014.
 */
public class Moves {
    private String name;
    public String getName() { return name; }
    
    private int damage;
    public int getDamage() { return damage; }

    private EnumTypes type;
    public EnumTypes getType() { return type; }

    public Moves(String name, int damage, EnumTypes type) {
        this.name   =   name;
        this.damage = damage;
        this.type   =   type;
    }
}
