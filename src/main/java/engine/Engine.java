package src.main.java.engine;

import src.main.java.engine.creatures.*;
import java.util.Scanner;

/**
 * This class sets up all of the components required for running the game.
 */
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class Engine {
    Scanner play;
    public Engine() {
        Player player = new Player();
        String input = play.nextLine();
        if(input.compareTo("/help")==0)
        {
            System.out.println("Hello! Here are some commands:");
            System.out.println("/quit: Quits the game");
            System.out.println("/help: Displays a list of all the commands");
            System.out.println("f: Move forward on a route or town");
            System.out.println("/party: Displays info on your pokemon");
            System.out.println("c: Go to Pokemon Center (only in town)");
            System.out.println("m: Go to PokeMart (only in towns)");
        }
        if(input.equalsIgnoreCase("/quit"))
        {
            System.exit(0);
        }
        if(input.equalsIgnoreCase("/party"))
        {
            for(AbstractCreature creature : player.getParty()) { System.out.println(creature.getName() + " " + creature.getHP() + "HP"); }
        }
    }
}
