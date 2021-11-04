import java.util.*;

public class TxtParse {


    public List<Armor> parseArmor() {

        String txt = this.getClass().getResource(**).getPath();
        txt = txt.substring(1,txt.length()-4) + "src/";
        txt += "ConfigFiles"; // Change this to where folder where txt files are

        String txt = System.getProperty("user.dir") + "/src/ConfigFiles"; // update this to folder where txt files are
        List<String> list = readFileInList(txt + "Armory.txt");
        Iterator<String> iter = list.iterator();
        List<Armor> listArmor = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] = s.split("\\s+");
            Armor armor = new Armor(s[0], new BigDecimal(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]))
            listArmor.add(armor);
        }

        return listArmor
    }

}