package src.main.java;

import src.main.java.engine.ExampleMenu;

import java.util.ArrayList;

/**
 * story base: you have long-term memory loss, so you can't remember your way
 * home after you leave. As such, you can never go back to a town that is more than
 * 1 route-length away. Example:
 *
 * X - - - T <- player is in the first town
 * T X - - T <- player is one route-length away from the town. they can still go back
 * T - X - T <- player is two route-lengths away from the first town, can no longer go back
 *
 * This method would allow us to only save multiple towns if there are multiple towns
 * within one route-length of the player
 */
public class Main implements Runnable {
	public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        test.add("Option");
        test.add("Option");
        test.add("Option");
        ExampleMenu<String> example = new ExampleMenu<String>(test);
        example.displayMenu();
	}

    @Override
    public void run() {

    }
}