package src.main.java.engine;
//Creates route length
import java.util.*;
import src.main.java.engine.creatures.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class BattleRun{
  Scanner play;
    ArrayList<EnumTypes> types = new ArrayList<EnumTypes>();
    private void fill
  public BattleRun(){
      Player player = new Player();
      String input = Integer.toString(play.nextInt());
      WildCreature enemy = new WildCreature();
      AbstractCreature[] party = player.getParty();
      System.out.println("A wild pokemon approaches! " + enemy.getName() + " wants to battle!");
      System.out.println("You sent out " + party[0].getName());
      System.out.println("What do?");
      System.out.println("1.Moves");
      System.out.println("2.Pokemon");
      System.out.println("3.Run");
      if(input.equals("1")||input.equals("Moves"))
      {
          int i = 0;
        for(Moves move : party[0].getMoves())
        {
          System.out.println(i + move.getName());
          i++;
        }
      }
    }
  }
