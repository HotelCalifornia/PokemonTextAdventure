package src.main.java.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * This class sets up the basic properties of a menu
 */
public class Menu<E> {

    //stores the options available in this menu
    private List<E> options;
    //returns the list of options
    public List<E> getOptions() { return options; }

    public Menu() {
        options = new ArrayList<E>();
    }

    public Menu(List<E> list) {
        options = list;
    }

    //display the contents of the menu
    //for this project, we must make sure to override the toString() method where applicable
    public void displayMenu() {
        int i = 0;
        for(E element : options) {
            System.out.println((i+1)+". "+element.toString());
            i++;
        }
    }


}
