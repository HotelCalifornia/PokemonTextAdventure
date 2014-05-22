package src.main.java.engine;
import java.util.Random;
import java.util.ArrayList;
public class RandomNames
{

    public static String getName(ArrayList<String> prefix, ArrayList<String> suffix)
    {
        Random ran = new Random();
        int prefSpot = 1+(int)(Math.random() *prefix.size());
        int sufSpot = 1+(int)(Math.random()*suffix.size());
        return prefix.get(prefSpot)+suffix.get(sufSpot);
    }
}