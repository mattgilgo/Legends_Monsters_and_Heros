import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
* TxtParse - class to handle all txt file read-ins and initialize Items/Characters
*/
public class TxtParse {

    Object file;


    public List<Armor> parseArmor() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Armory.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        ArrayList<Armor> listArmor = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Armor armor = new Armor(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            listArmor.add(armor);
        }

        return listArmor;
    }

    public List<Dragon> parseDragon() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Dragons.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Dragon> listDragon = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Dragon dragon = new Dragon(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listDragon.add(dragon);
        }

        return listDragon;
    }

    public List<Exoskeleton> parseExoskeleton() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Exoskeletons.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Exoskeleton> listExoskeleton = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Exoskeleton exoskeleton = new Exoskeleton(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listExoskeleton.add(exoskeleton);
        }

        return listExoskeleton;
    }

    public List<FireSpell> parseFireSpell() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/FireSpells.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<FireSpell> listFireSpell = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            FireSpell firespell = new FireSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listFireSpell.add(firespell);
        }

        return listFireSpell;
    }

    public List<IceSpell> parseIceSpell() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/IceSpells.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<IceSpell> listIceSpell = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            IceSpell icespell = new IceSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listIceSpell.add(icespell);
        }

        return listIceSpell;
    }

    public List<LightningSpell> parseLightningSpell() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/LightningSpells.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  
        }

        Iterator<String> iter = list.iterator();
        List<LightningSpell> listLightningSpell = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            LightningSpell lightningspell = new LightningSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listLightningSpell.add(lightningspell);
        }

        return listLightningSpell;
    }

    public List<Paladin> parsePaladin() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Paladins.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Paladin> listPaladin = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Paladin paladin = new Paladin(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listPaladin.add(paladin);
        }

        return listPaladin;
    }

    public List<Potion> parsePotion() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Potions.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Potion> listPotion = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Potion potion = new Potion(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4]);
            listPotion.add(potion);
        }

        return listPotion;
    }

    public List<Sorcerer> parseSorcerer() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Sorcerers.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Sorcerer> listSorcerer = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Sorcerer sorcerer = new Sorcerer(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listSorcerer.add(sorcerer);
        }

        return listSorcerer;
    }

    public List<Spirit> parseSpirit() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Spirits.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Spirit> listSpirit = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Spirit spirit = new Spirit(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listSpirit.add(spirit);
        }

        return listSpirit;
    }

    public List<Warrior> parseWarrior() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Warriors.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        ArrayList<Warrior> listWarrior = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Warrior warrior = new Warrior(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listWarrior.add(warrior);
        }

        return listWarrior;
    }

    public List<Weapon> parseWeapon() throws FileNotFoundException {

        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Weaponry.txt");
        File file = new File(txt.toString());
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Weapon> listWeapon = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Weapon weapon = new Weapon(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listWeapon.add(weapon);
        }

        return listWeapon;
    }

}