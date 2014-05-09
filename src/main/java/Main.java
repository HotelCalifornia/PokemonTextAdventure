package src.main.java;

import src.main.java.engine.Menu;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        test.add("Option");
        test.add("Option");
        test.add("Option");
        Menu<String> example = new Menu<String>(test);
        example.displayMenu();
	}
}