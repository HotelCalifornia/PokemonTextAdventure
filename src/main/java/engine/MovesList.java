package src.main.java.engine;
import java.util.Random;
import java.util.ArrayList;
import src.main.java.engine.creatures.Moves;
import src.main.java.engine.creatures.EnumTypes;
public class MovesList {
  public static ArrayList<Moves> moves = new ArrayList<Moves>();
    ArrayList<EnumTypes> types = new ArrayList<EnumTypes>();
    ArrayList<String> suffixes = new ArrayList<String>();
    ArrayList<String> ghostNames = new ArrayList<String>();
    ArrayList<String> psyNames = new ArrayList<String>();
    ArrayList<String> flyNames = new ArrayList<String>();
    ArrayList<String> elecNames = new ArrayList<String>();
    ArrayList<String> grassNames = new ArrayList<String>();
    ArrayList<String> waterNames = new ArrayList<String>();
    ArrayList<String> fireNames = new ArrayList<String>();
  public MovesList() {

      fireNames.add(0, "Pyro");
      fireNames.add(1, "Nova");
      fireNames.add(2, "Cinder");
      fireNames.add(3, "Corona");
      fireNames.add(4, "Fire");

      waterNames.add(0, "Hydro");
      waterNames.add(1, "Aqua");
      waterNames.add(2, "Frost");
      waterNames.add(3, "Swamp");
      waterNames.add(4, "Water");

      grassNames.add(0, "Leaf");
      grassNames.add(1, "Grass");
      grassNames.add(2, "Vine");
      grassNames.add(3, "Solar");
      grassNames.add(4, "Ground");

      elecNames.add(0, "Thunder");
      elecNames.add(1, "Volt");
      elecNames.add(2, "Lightning");
      elecNames.add(3, "Quick");
      elecNames.add(4, "Zap");

      flyNames.add(0, "Wind");
      flyNames.add(1, "Beak");
      flyNames.add(2, "Wing");
      flyNames.add(3, "Gale");
      flyNames.add(4, "Quill");

      psyNames.add(0, "Nuero");
      psyNames.add(1, "Mind");
      psyNames.add(2, "Psy");
      psyNames.add(3, "Insane");
      psyNames.add(4, "Psionic");

      ghostNames.add(0, "Ecto");
      ghostNames.add(1, "Shadow");
      ghostNames.add(2, "Final");
      ghostNames.add(3, "Spectre");
      ghostNames.add(4, "Reaper");

      suffixes.add(0, "Beam");
      suffixes.add(1, "Blast");
      suffixes.add(2, "Bolt");
      suffixes.add(3, "Slash");
      suffixes.add(4, "Slap");
      suffixes.add(5, "Scratch");
      suffixes.add(6, "Strike");
      suffixes.add(7, "Burn");
      suffixes.add(8, "Burst");
      suffixes.add(9, "Squall");
      suffixes.add(10, "Pulse");
      suffixes.add(11, "Shock");
      suffixes.add(12, "Discharge");
      suffixes.add(13, "Ungentlemanly Response");
      suffixes.add(14, "Curse");

      types.add(EnumTypes.FIRE);
      types.add(EnumTypes.WATER);
      types.add(EnumTypes.GRASS);
      types.add(EnumTypes.ELEC);
      types.add(EnumTypes.FLYING);
      types.add(EnumTypes.PSYCHIC);
      types.add(EnumTypes.GHOST);

      for(int i = 0; i <= 750; i++) {
          moves.add(makeMoves());
      }
  }
  private Moves makeMoves() {
      Random rand = new Random();
      int t = rand.nextInt(6);
      EnumTypes type = types.get(t);
      String pref = "";
      if(type==EnumTypes.FIRE) {
          t = rand.nextInt(fireNames.size());
          pref = fireNames.get(t);
      }
      else if (type==EnumTypes.WATER) {
          t = rand.nextInt(waterNames.size());
          pref = waterNames.get(t);
      }
      else if (type==EnumTypes.GRASS) {
          t = rand.nextInt(grassNames.size());
          pref = grassNames.get(t);
      }
      else if (type==EnumTypes.ELEC) {
          t = rand.nextInt(elecNames.size());
          pref = elecNames.get(t);
      }
      else if (type==EnumTypes.FLYING) {
          t = rand.nextInt(flyNames.size());
          pref = flyNames.get(t);
      }
      else if (type==EnumTypes.PSYCHIC) {
          t = rand.nextInt(psyNames.size());
          pref = psyNames.get(t);
      }
      else if (type==EnumTypes.GHOST) {
          pref = ghostNames.get(t);
      }
      t = rand.nextInt(suffixes.size());
      String suf = suffixes.get(t);
      String name = pref + " " + suf;
      return new Moves(name, (int)(5 + Math.random() * 31) , type);
    }
  }
