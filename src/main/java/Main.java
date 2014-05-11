package src.main.java;

import src.main.java.engine.ExampleMenu;

import java.util.ArrayList;

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