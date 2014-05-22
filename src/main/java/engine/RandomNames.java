package src.main.java.engine;
import java.util.Random;
import java.util.ArrayList;
public class RandomNames
{

    public static String getName()
    {
        ArrayList<String> prefix = new ArrayList<String>();
        prefix.add("Pyro");
        prefix.add("Aqua");
        prefix.add("Cryo");
        prefix.add("Gaia");
        prefix.add("Rai");
        prefix.add("Regi");
        prefix.add("Sora");
        prefix.add("Tri");
        prefix.add("Avus");
        prefix.add("Aether");
        prefix.add("Umbra");
        prefix.add("Neuro");
        prefix.add("Xeo");
        ArrayList<String> suffix = new ArrayList<String>();
        suffix.add("Mon");
        suffix.add("Nova");
        suffix.add("Rex");
        suffix.add("Wind");
        suffix.add("Leaf");
        suffix.add("Razor");
        suffix.add("Shine");
        suffix.add("Blitz");
        suffix.add("Hawk");
        suffix.add("Drake");
        suffix.add("Wave");
        Random ran = new Random();
        int prefSpot = (int)(Math.random() *prefix.size());
        int sufSpot = (int)(Math.random()*suffix.size());
        return prefix.get(prefSpot)+suffix.get(sufSpot);
    }
}
