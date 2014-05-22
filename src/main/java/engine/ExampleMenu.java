package src.main.java.engine;

import java.util.ArrayList;

public class ExampleMenu<E> extends AbstractMenu {
    public ExampleMenu(ArrayList<E> list) {
        super(list);
    }
    @Override
    public void selectOption(String in) {
        keyPressed(in);
    }

    public void keyPressed(String in) {
        //do something
        /**
         * for example,
         */
    }
}
