package src.main.java.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

/**
 * This class sets up the basic properties of a menu
 */
public abstract class AbstractMenu<E> {

    //stores the options available in this menu
    private List<E> options;
    //returns the list of options
    public List<E> getOptions() { return options; }

    public AbstractMenu() {
        options = new ArrayList<E>();
    }

    public AbstractMenu(List<E> list) {
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
    
    public abstract void selectOption(String in);


}
