package src.main.java.engine;

import src.main.java.engine.creatures.*;
import java.util.Scanner;
import src.main.java.engine.creatures.EnumTypes;
import src.main.java.engine.creatures.WildCreature;

/**
 * This class sets up all of the components required for running the game.
 */
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class Engine 
{
    Scanner play;
    public Engine() 
    {
        Player player = new Player();
        
        String input = play.nextLine();
        ArrayList<EnumTypes> types = new ArrayList<EnumTypes>();
        types.add(EnumTypes.FIRE);
        types.add(EnumTypes.WATER);
        types.add(EnumTypes.GRASS);
        types.add(EnumTypes.ELEC);
        types.add(EnumTypes.FLYING);
        types.add(EnumTypes.PSYCHIC);
        types.add(EnumTypes.GHOST);
        
        player.addCreatureToPartyOrBox(new WildCreature(types.get(t), rand.nextInt(), RandomNames.getName()));
        
        
        if(input.compareTo("/help")==0)
        {
            System.out.println("Hello! Here are some commands:");
            System.out.println("/quit: Quits the game");
            System.out.println("/help: Displays a list of all the commands");
            System.out.println("F: Move forward on a route");
            System.out.println("/party: Displays info on your pokemon");
            System.out.println("C: Go to Pokemon Center (only in town)");
        }
        if(input.equalsIgnoreCase("/quit"))
        {
            System.exit(0);
        }
        if(input.equalsIgnoreCase("/party"))
        {
            for(AbstractCreature creature : player.getParty()) { System.out.println(creature.getHP()); }
        }
        
        RouteGenerator route = new RouteGenerator();
    }
}
public void help()
{
    System.out.println("Hello! Here are some commands:");
    System.out.println("/quit: Quits the game");
    System.out.println("/help: Displays a list of all the commands");
    System.out.println("F: Move forward on a route");
    System.out.println("/party: Displays info on your pokemon");
    System.out.println("C: Go to Pokemon Center (only in town)");
}
