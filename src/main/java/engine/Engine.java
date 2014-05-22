package src.main.java.engine;

import src.main.java.engine.creatures.*;

import java.util.ArrayList;
import java.util.Random;
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
        play = new Scanner(System.in);
        MovesList moves = new MovesList();
        ArrayList<EnumTypes> types = new ArrayList<EnumTypes>();
        types.add(EnumTypes.FIRE);
        types.add(EnumTypes.WATER);
        types.add(EnumTypes.GRASS);
        types.add(EnumTypes.ELEC);
        types.add(EnumTypes.FLYING);
        types.add(EnumTypes.PSYCHIC);
        types.add(EnumTypes.GHOST);
        Player player = new Player();
        Random rand = new Random();
        int t = rand.nextInt(types.size());
        player.addCreatureToPartyOrBox(new WildCreature(types.get(t), rand.nextInt(), RandomNames.getName()));
        player.getParty()[0].setHP(player.getParty()[0].getHPStat());
        boolean intro = true;
        while(intro) {
            String input = play.nextLine();
            System.out.println("Type '/help' for a list of commands, and '/begin' to begin your adventure!");
            if(input.equalsIgnoreCase("/help")) {
                System.out.println("Hello! Here are some commands:");
                System.out.println("/quit: Quits the game");
                System.out.println("/help: Displays a list of all the commands");
                System.out.println("F: Move forward on a route");
                System.out.println("/party: Displays info on your pokemon");
                System.out.println("C: Go to Pokemon Center (only in town)");
            }
            if(input.equalsIgnoreCase("/quit")) {
                System.exit(0);
            }
            if(input.equalsIgnoreCase("/party")) {
                for (AbstractCreature creature : player.getParty()) {
                    if(creature != null) {
                        System.out.println(creature.getName() + " " + creature.getHP());
                    }
                }
            }
            if(input.equalsIgnoreCase("/begin")) {
                intro = false;
            }
        }
        
        RouteGenerator route = new RouteGenerator(player);
        route.generate();
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
}
