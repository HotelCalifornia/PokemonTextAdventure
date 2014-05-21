package src.main.java.engine;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class ExampleMenu<E> extends AbstractMenu {
    public ExampleMenu(ArrayList<E> list) {
        super(list);
    }
    @Override
    public void selectOption(KeyEvent e) {
        keyPressed(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_1 : System.out.println("You have selected Option 1.");
            case KeyEvent.VK_2 : System.out.println("You have selected Option 2.");
            case KeyEvent.VK_3 : System.out.println("You have selected Option 3.");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
