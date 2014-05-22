package src.main.java.engine;

//Creates route lengths
import java.util.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class TownGenerator
{
  private int i;
  private int j;
  boolean loop;
  private char playerInput1;
  private char playerInput2;
  private String townPrefix;
  private String townSuffix;
  private String townName;
  Scanner input;
  public TownGenerator()
  {
    loop = true;
    
    i = (int)(Math.random() * 14) + 1;
    i = (int)(Math.random() * 7) + 1;
    //creates town name
    switch(i)
    {
      case 1:
        townPrefix = "Pallet";
        break;
      case 2:
        townPrefix = "Mikado";
        break;
      case 3:
        townPrefix = "Cobalt";
        break;
      case 4:
        townPrefix = "Denim";
        break;
      case 6:
        townPrefix = "Goldenrod";
        break;
      case 7:
        townPrefix = "Firebrick";
        break;
      case 8:
        townPrefix = "Peach";
        break;
      case 9:
        townPrefix = "Turquoise";
        break;
      case 10:
        townPrefix = "Burlywood";
        break;
      case 11:
        townPrefix = "Sienna";
        break;
      case 12:
        townPrefix = "Azure";
        break;
      case 13:
        townPrefix = "Ivory";
        break;
      case 14:
        townPrefix = "Cornflower";
        break;
      case 15:
        townPrefix = "Starch";
        break;
      default:
        townPrefix = "Crappy";
    }
    switch(j)
    {
      case(1):
        townSuffix = " Town";
        break;
      case(2):
        townSuffix = " City";
        break;
      case(3):
        townSuffix = " Village";
        break;
      case(4):
        townSuffix = "Burg";
        break;
      case(5):
        townSuffix = " Municipality";
        break;
      case(6):
        townSuffix = " Autonomous Collective";
        break;
      case(7):
        townSuffix = " Whistle-top";
        break;
      case(8):
        townSuffix = " Hamlet";
        break;
      default:
        townSuffix = "Town";
    }
    townName = townPrefix + townSuffix;
    //town introduction
    System.out.println("Welcome to " + townName);
    System.out.println("Pokecenter:C");
    System.out.println("Leave town/Enter next route: L")
    //town interface
    while(loop == true)
    {
      playerInput1 = input.nextLine().toChar()[0];
      if (playerInput1 == 'C' || playerInput == 'c'):
          System.out.println("Heal: H");
          System.out.println("Exit: E");
          playerInput2 = input.nextLine().toChar()[0];
          switch(playerInput2)
          {
            case('H' || 'h'):
              //add HP
              break;
            case('E'||'E')
            break;
          }
      }
      else if(playerInput1 == 'L' || playerInput1 == 'l')
      {
        loop = false;
      }
      //error catch
      else
      {
        System.out.println("Error: Unrecognized Command");
      }
    }
    RouteGenerator route = new RouteGenerator;
  }
}
