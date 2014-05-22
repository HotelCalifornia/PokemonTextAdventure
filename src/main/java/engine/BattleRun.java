package src.main.java.engine;
//Creates route length
import java.util.*;
import src.main.java.engine.creatures.*;
@SuppressWarnings("unused") //stops the warnings complaining that this class is unused
public class BattleRun{
  Scanner play;
  AbstractCreature[] party;
  AbstractCreature enemy;
  RouteGenerator route;
  boolean go = true;
  public BattleRun(AbstractCreature enemy, RouteGenerator route) {
      this.enemy = enemy;
      Player player = new Player();
      String input = play.next();
      party = player.getParty();
      while(go) {
          System.out.println("A wild pokemon approaches! " + enemy.getName() + " wants to battle!");
          System.out.println("You sent out " + party[0].getName());
          System.out.println("What do?");
          System.out.println("1. Moves");
          System.out.println("2. Pokemon");
          System.out.println("3. Catch");
          System.out.println("4. Run");
          if(input.equals("1") || input.equalsIgnoreCase("Moves")) {
              moveListener();
          }
          else if(input.equals("2") || input.equalsIgnoreCase("Pokemon")) {
              switchListener();
          }
          else if(input.equals("3") || input.equalsIgnoreCase("Catch")) {
              int caught = 1 + (int) (Math.random() * 3);
              if(caught == 1) {
                  player.addCreatureToPartyOrBox(enemy);
                  end();
              }
          }
          else if(input.equals("4") || input.equalsIgnoreCase("Run")) {
              int getaway = 1 + (int) (Math.random() * 3);
              if(getaway == 1 || getaway == 2) {
                  System.out.println("You got away safely!");
                  end();
              }
              else {
                  System.out.println("Couldn't get away!");
              }
          }
          enemyTurn();
      }
    }
    private void enemyTurn() {
        enemy.useMove(party[0], enemy.bestMove(enemy.getType(), party[0].getType()));
        if(party[0].getHP() <= 0) {
            for (AbstractCreature aParty : party) {
                if (aParty != null) {
                    if (!(aParty.getHP() <= 0)) {
                        switchListener();
                    }
                } else {
                    System.out.flush();
                    System.out.println("Game Over.");
                    System.out.println("Press any key to exit...");
                    if (play.next() != null) {
                        System.exit(0);
                    }
                }
            }
        }
    }
    private void moveListener() {
        int i = 1;
        for(Moves move : party[0].getMoves())
        {
            System.out.println(i + " " + move.getName());
            i++;
        }
        String input = play.next();
        if(input.equals("1") || input.equalsIgnoreCase(party[0].getMoves().get(0).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(0));
            if(enemy.getHP() <= 0) {
                end();
            }
        }
        else if(input.equals("2") || input.equalsIgnoreCase(party[0].getMoves().get(1).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(1));
            if(enemy.getHP() <= 0) {
                end();
            }
        }
        else if(input.equals("3") || input.equalsIgnoreCase(party[0].getMoves().get(2).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(2));
            if(enemy.getHP() <= 0) {
                end();
            }
        }
        else if(input.equals("4") || input.equalsIgnoreCase(party[0].getMoves().get(3).getName())) {
            party[0].useMove(enemy, party[0].getMoves().get(3));
            if(enemy.getHP() <= 0) {
                end();
            }
        }
        else {
            System.out.println("Invalid Command");
            moveListener();
        }
    }
    private void switchListener() {
        int i = 1;
        for(AbstractCreature c : party) {
            System.out.println(i + " " + c.getName());
            i++;
        }
        String input = play.next();
        System.out.println("Type the number of the creature you'd like to send out next");
        if(input.equals("1") || input.equalsIgnoreCase(party[0].getName())) {
            System.out.println(party[0].getName() + " is already in battle!");
        }
        else if(input.equals("2")) {
            System.out.println(party[0].getName() + ", return!");
            if(!(party[1].getHP() <= 0)) {
                swap(1);
            }
            else {
                System.out.println(party[1].getName() + " has no energy left to battle!");
            }
        }
        else if(input.equals("3")) {
            System.out.println(party[0].getName() + ", return!");
            if(!(party[2].getHP() <= 0)) {
                swap(2);
            }
            else {
                System.out.println(party[2].getName() + " has no energy left to battle!");
            }
        }
        else if(input.equals("4")) {
            System.out.println(party[0].getName() + ", return!");
            if(!(party[3].getHP() <= 0)) {
                swap(3);
            }
            else {
                System.out.println(party[3].getName() + " has no energy left to battle!");
            }
        }
        else if(input.equals("5")) {
            System.out.println(party[0].getName() + ", return!");
            if(!(party[4].getHP() <= 0)) {
                swap(4);
            }
            else {
                System.out.println(party[4].getName() + " has no energy left to battle!");
            }
        }
        else if(input.equals("6")) {
            System.out.println(party[0].getName() + ", return!");
            if(!(party[5].getHP() <= 0)) {
                swap(5);
            }
            else {
                System.out.println(party[5].getName() + " has no energy left to battle!");
            }
        }
    }
    private void swap(int index) {
        AbstractCreature t = party[0];
        party[0] = party[index];
        party[index] = t;
    }
    private void end() {
        party[0].addExp(party[0].calculateEXP());
        go = false;
        route.generate();
    }
  }
