import java.io.File;
import java.util.*;

public class TxtParse {

    Object file;


    public List<Armor> parseArmor() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Armory.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
        }

        Iterator<String> iter = list.iterator();
        List<Armor> listArmor = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Armor armor = new Armor(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            listArmor.add(armor);
        }

        return listArmor;
    }

    public List<Dragon> parseDragon() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Dragons.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<Exoskeleton> parseExoskeleton() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Exoskeletons.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<FireSpell> parseFireSpell() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "FireSpells.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<IceSpell> parseIceSpell() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "IceSpells.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<IceSpell> parseLightningSpell() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "LightningSpells.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<Paladin> parsePaladin() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Paladins.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
        }

        Iterator<String> iter = list.iterator();
        List<Paladin> listPaladin = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Paladin paladin = new Paladin(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]));
            listPaladin.add(paladin);
        }

        return listPaladin;
    }

    public List<Potion> parsePotion() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Potions.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<Sorcerer> parseSorcerer() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Sorcerers.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
        }

        Iterator<String> iter = list.iterator();
        List<Sorcerer> listSorcerer = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Sorcerer sorcerer = new Sorcerer(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]));
            listSorcerer.add(sorcerer);
        }

        return listSorcerer;
    }

    public List<Spirit> parseSpirit() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Spirits.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
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

    public List<Warrior> parseWarrior() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Warriors.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
        }

        Iterator<String> iter = list.iterator();
        List<Warrior> listWarrior = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Warrior warrior = new Warrior(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listWarrior.add(warrior);
        }

        return listWarrior;
    }

    public List<Weapon> parseWeapon() {

        String txt = System.getProperty("user.dir") + "/src/ReadInTxtFiles";
        Scanner scan = new Scanner(new File(txt + "Weaponry.txt"));
        List<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  // might have to change this to next() if there are issues with parser
        }

        Iterator<String> iter = list.iterator();
        List<Weapon> listWeapon = new ArrayList<>();
        iter.next();

        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Weapon weapon = new Weapon(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            listWeapon.add(weapon);
        }

        return listWeapon;
    }

}