package src.main.java.engine;
//Creates route length
import java.util.*;
import java.engine.creatures.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class BattleRun{
  Scanner play;
  public BatlleRun(){
      Player player = new Player();
      String input = play.nextInt;
      WildCreature enemy = new WildCreature();
      AbstractCreature[] party = player.getParty();
      System.out.println("A wild pokemon approaches! " + enemy.getName() + " wants to battle!");
      System.out.println("You sent out " + party[0].getName());
      System.out.println("What do?");
      System.out.println("1.Moves");
      System.out.println("2.Pokemon");
      System.out.println("3.Run");
      if(input.compareTo("1")==0||input.compareTo("Moves"))
      {
        for(Moves move : party[0].getMoves())
        {
          int i = 0;
          System.out.println(i + move.getName());
          i++;
        }
      }
    }
  }