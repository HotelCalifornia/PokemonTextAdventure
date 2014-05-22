
package src.main.java.engine;
//Creates route length
import src.main.java.engine.creatures.EnumTypes;

import java.util.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class RouteGenerator
{
  private int routeNum;
  private double pkmnRand;
  private int routeLength;
  private char direction;
  private int i;
  Scanner move;
  public RouteGenerator()
  {
      //defines variables
      routeNum = 0;
      pokemonAppear = false;
      routeLength = 0;
      move = new Scanner(System.in);
      direction = ' ';
      i = 1;
      pkmnRand = 0.0;
  }
  public void generate()
    {
      ArrayList<EnumTypes> types = new ArrayList<EnumTypes>();
      types.add(EnumTypes.FIRE);
      types.add(EnumTypes.WATER);
      types.add(EnumTypes.GRASS);
      types.add(EnumTypes.ELEC);
      types.add(EnumTypes.FLYING);
      types.add(EnumTypes.PSYCHIC);
      types.add(EnumTypes.GHOST);
      //determines the route length between 5 and 15
      routeLength= 5 + (int)(Math.random()*10);
      //gives info about route to player upon entering route
      System.out.println("Route " + routeNum);
      System.out.println("The route is " + routeLength + " spaces long");
      //handles player movement 
      while(i <= routeLength)
    {
      //gives aditional info about route and instructions about how to navigate route
      System.out.println("you are on space " + i);
      System.out.println("Which direction would you like to go?");
      System.out.println("Foward:F");
      //accepts player input
      direction = move.nextLine().toCharArray()[0];
      // progresses in player chosen direction
      if (direction == 'f' || direction == 'F')
      {
        i++;
        pkmnRand = Math.random();
        if (pkmnRand >= .8)
        {
            Random rand = new Random();
          int t = rand.nextInt(types.size());
          WildCreature(types.get(t), rand.nextInt(), );
        }
      }
      //error catch
      else
      {
        System.out.println("Error: unrecognized direction");
      }
      if (i > routeLength)
      {
          routeNum++;
          TownGenerator();
      }
      //puts player into next town
    }
  }
}
