//Creates route lengths
import java.util.*;
package src.main.java.engine;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class RouteGenerator
{
  private int routeNum;
  private boolean pokemonAppear;
  private int routeLength;
  private char direction;
  private int i;
  public RouteGenerator()
  {
      //defines variables
      routeNum = 0;
      pokemonAppear = false;
      routeLength = 0;
      Scanner move = new Scanner(System.in);
      direction = null;
      i = 1;
  
  }
  public generate() {
    //determines the route length between 5 and 15
    routeLength= 5 + (int)(Math.random()*10);
    //gives info about route to player upon entering route
    system,out.println("Route " + routeNum);
    system.out.println("The route is " + routeLength + " spaces long");
    //handles player movement 
    while(i <= routeLength)
    {
      //gives aditional info about route and instructions about how to navigate route
      System.out.println("you are on space " + i)
      System.out.println("Which direction would you like to go?");
      System.out.println("Foward:F");
      //accepts player input
      direction = move.nextLine();
      // progresses in player chosen direction
      if (direciton == 'f' || direction == 'F')
      {
        i++;
      }
      //error catch
      else
      {
        System.out.println("Error: unrecognized direction")
      }
      //puts player into next town
      else if (i > routeLength)
      {
        routeNum++;
        //need town generation to complete
      }
    }
  }
}
