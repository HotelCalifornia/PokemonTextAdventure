//Creates route lengths
import java.util.*;
package src.main.java.engine;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class TownGenerator
{
  private int i;
  private String townPrefix;
  private Stirng townSuffix;
  public TownGeneration()
  {
    i = (int)(Math.random * 14) + 1;
    switch(i)
    {
      case 1:
        townPrefix = "Pallet ";
        break;
      case 2:
        townPrefix = "Mikado ";
        break;
      case 3:
        townPrefix = "Cobalt ";
        break;
      case 4:
        townPrefix = "Denim ";
        break;
      case 6:
        townPrefix = "Goldenrod ";
        break;
      case 7:
        townPrefix = "Firebrick ";
        break;
      case 8:
        townPrefix = "Peach ";
        break;
      case 9:
        townPrefix = "Turqoise ";
        break;
      case 10:
        townPrefix = "Burlywood ";
        break;
      case 11:
        townPrefix = "Sienna ";
        break;
      case 12:
        townPrefix = "Azure ";
        break;
      case 13:
        townPrefix = "Ivory ";
        break;
      case 14:
        townPrefix = "Cornflower ";
        break;
      case 15:
        townPrefix = "Starch ";
        break;
    }
  }
}
