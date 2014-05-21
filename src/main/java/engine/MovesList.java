import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import src.main.java.engine.creatures.Moves;
import src.main.java.engine.creatures.EnumTypes;
public static class MovesList {
  private ArrayList<Moves> moves = new ArrayList<Moves>;
  public static void makeMoves() {
    ArrayList<String> fireNames = new ArrayList<String>;
    fireNames.add(0, "Pyro");
    fireNames.add(1, "Nova");
    fireNames.add(2, "Cinder");
    fireNames.add(3, "Corona");
    fireNames.add(4, "Fire");
    ArrayList<String> waterNames = new ArrayList<String>;
    waterNames.add(0, "Hydro");
    waterNames.add(1, "Aqua");
    waterNames.add(2, "Frost");
    waterNames.add(3, "Swamp");
    waterNames.add(4, "Water");
    ArrayList<String> grassNames = new ArrayList<String>;
    grassNames.add(0, "Leaf");
    grassNames.add(1, "Grass");
    grassNames.add(2, "Vine");
    grassNames.add(3, "Solar");
    grassNames.add(4, "Ground");
    ArrayList<String> elecNames = new ArrayList<String>;
    elecNames.add(0, "Thunder");
    elecNames.add(1, "Volt");
    elecNames.add(2, "Lightning");
    elecNames.add(3, "Quick");
    elecNames.add(4, "Zap");
    ArrayList<String> flyNames = new ArrayList<String>;
    flyNames.add(0, "Wind");
    flyNames.add(1, "Beak");
    flyNames.add(2, "Wing");
    flyNames.add(3, "Gale");
    flyNames.add(4, "Quill");
    ArrayList<String> psyNames = new ArrayList<String>;
    psyNames.add(0, "Nuero");
    psyNames.add(1, "Mind");
    psyNames.add(2, "Psy");
    psyNames.add(3, "Insane");
    psyNames.add(4, "Psionic");
    ArrayList<String> ghostNames = new ArrayList<String>;
    ghostNames.add(0, "Ecto");
    ghostNames.add(1, "Shadow");
    ghostNames.add(2, "Final");
    ghostNames.add(3, "Spectre");
    ghostNames.add(4, "Reaper");
    ArrayList<String> suffixes = new ArrayList<String>;
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
    ArrayList<EnumTypes> types = new ArrayList<EnumTypes>;
    types.add(EnumTypes FIRE);
    types.add(EnumTypes WATER);
    types.add(EnumTypes GRASS);
    types.add(EnumTypes ELEC);
    types.add(EnumTypes FLYING);
    types.add(EnumTypes PSYCHIC);
    types.add(EnumTypes GHOST);

      Random rand = new Random(7)+1;
      EnumTypes type = types.get(rand)
      Random ran = new Random(5)+1;
      String pref = new String;
      if(type==FIRE)
        pref = fireNames.get(ran);
      else if (type==WATER)
        pref = waterNames.get(ran);
      else if (type==GRASS)
        pref = grassNames.get(ran);
      else if (type==ELEC)
        pref = elecNames.get(ran);
      else if (type==FLYING)
        pref = flyNames.get(ran);
      else if (type==PSYCHIC)
        pref = psyNames.get(ran);
      else if (type==GHOST)
        pref = ghostNames.get(ran);
      Random ra = new Random(15)+1;
      String suf = suffixes.get(ra);
      String name = pref + " " + suf;
      Moves move = new Moves(name, , type)
    }
    
    
  }
}
