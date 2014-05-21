
package src.main.java.engine;
//Creates route length
import java.util.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class RouteGenerator
{
  private int routeNum;
  private boolean pokemonAppear;
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
          
        }
      }
      else if (i > routeLength)
      {
          routeNum++;
          //need town generation to complete
      }
      //error catch
      else
      {
        System.out.println("Error: unrecognized direction");
      }
      //puts player into next town
    }
  }
}
