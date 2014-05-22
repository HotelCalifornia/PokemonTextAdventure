package src.main.java.engine;

import src.main.java.engine.creatures.*;
import java.util.Scanner;

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
    }
}
