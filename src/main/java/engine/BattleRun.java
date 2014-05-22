package src.main.java.engine;
//Creates route length
import java.util.*;
import src.main.java.engine.creatures.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class BattleRun{
  Scanner play;
  public BattleRun(AbstractCreature enemy){
      Player player = new Player();
      String input = Integer.toString(play.nextInt());
      AbstractCreature[] party = player.getParty();
      System.out.println("A wild pokemon approaches! " + enemy.getName() + " wants to battle!");
      System.out.println("You sent out " + party[0].getName());
      System.out.println("What do?");
      System.out.println("1. Moves");
      System.out.println("2. Pokemon");
      System.out.println("3. Catch");
      System.out.println("4. Run");
      if(input.equals("1")||input.equalsIgnoreCase("Moves"))
      {
        int i = 0;
        for(Moves move : party[0].getMoves())
        {
            System.out.println(i + move.getName());
            i++;
        }
        input = Integer.toString(play.nextInt());
        if(input.equals("1") || input.equalsIgnoreCase(party[0].getMoves().get(0).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(0));
            if(enemy.getHP() <= 0) {
                end();
            }
        }
        else(input.equals("2") || input.equalsIgnoreCase(party[0].getMoves().get(1).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(1));
        }
      }
    }
    private void end() {

    }
  }
