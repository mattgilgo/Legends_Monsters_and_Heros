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

    // Method to parse Armory.txt file. Returns List of type Armor.
    public List<Armor> parseArmor() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Armory.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }
        
        Iterator<String> iter = list.iterator();
        ArrayList<Armor> listArmor = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Armor armor = new Armor(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            listArmor.add(armor);
        }

        // Return list of Armors
        return listArmor;
    }

    // Method to parse Dragons.txt file. Returns List of type Dragon.
    public List<Dragon> parseDragon() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Dragons.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Dragon> listDragon = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Dragon dragon = new Dragon(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listDragon.add(dragon);
        }

        // Return list of Dragons
        return listDragon;
    }

    // Method to parse Exoskeletons.txt file. Returns List of type Exoskeleton.
    public List<Exoskeleton> parseExoskeleton() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Exoskeletons.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Exoskeleton> listExoskeleton = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Exoskeleton exoskeleton = new Exoskeleton(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listExoskeleton.add(exoskeleton);
        }

        // Return list of Exoskeletons
        return listExoskeleton;
    }

    // Method to parse FireSpells.txt file. Returns List of type FireSpell.
    public List<FireSpell> parseFireSpell() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/FireSpells.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<FireSpell> listFireSpell = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            FireSpell firespell = new FireSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listFireSpell.add(firespell);
        }

        // Return list of FireSpells
        return listFireSpell;
    }

    // Method to parse IceSpell.txt file. Returns List of type IceSpell.
    public List<IceSpell> parseIceSpell() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/IceSpells.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<IceSpell> listIceSpell = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            IceSpell icespell = new IceSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listIceSpell.add(icespell);
        }

        // Return list of IceSpells
        return listIceSpell;
    }


    // Method to parse LightningSpells.txt file. Returns List of type LightningSpell.
    public List<LightningSpell> parseLightningSpell() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/LightningSpells.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());  
        }

        Iterator<String> iter = list.iterator();
        List<LightningSpell> listLightningSpell = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            LightningSpell lightningspell = new LightningSpell(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listLightningSpell.add(lightningspell);
        }

        // Return list of LightningSpells
        return listLightningSpell;
    }


    // Method to parse Paladins.txt file. Returns List of type Paladin.
    public List<Paladin> parsePaladin() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Paladins.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Paladin> listPaladin = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Paladin paladin = new Paladin(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listPaladin.add(paladin);
        }

        // Return list of Paladins
        return listPaladin;
    }


    // Method to parse Potions.txt file. Returns List of type Potion.
    public List<Potion> parsePotion() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Potions.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Potion> listPotion = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Potion potion = new Potion(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4]);
            listPotion.add(potion);
        }

        // Return list of Potions
        return listPotion;
    }


    // Method to parse Sorcerers.txt file. Returns List of type Sorcerer.
    public List<Sorcerer> parseSorcerer() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Sorcerers.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Sorcerer> listSorcerer = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Sorcerer sorcerer = new Sorcerer(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listSorcerer.add(sorcerer);
        }

        // Return list of Sorcerers
        return listSorcerer;
    }


    // Method to parse Spirits.txt file. Returns List of type Spirit.
    public List<Spirit> parseSpirit() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Spirits.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Spirit> listSpirit = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Spirit spirit = new Spirit(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listSpirit.add(spirit);
        }

        // Return list of Spirits
        return listSpirit;
    }


    // Method to parse Warriors.txt file. Returns List of type Warrior.
    public List<Warrior> parseWarrior() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Warriors.txt");
        File file = new File(txt.toString());

        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        ArrayList<Warrior> listWarrior = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Warrior warrior = new Warrior(str[0], 1, Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            listWarrior.add(warrior);
        }

        // Return list of Warriors
        return listWarrior;
    }


    // Method to parse Weapons.txt file. Returns List of type Weapon.
    public List<Weapon> parseWeapon() throws FileNotFoundException {

        // Get proper user directory from person for file
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "/src/ReadInTxtFiles");
        Path txt = Paths.get(filePath.toString(), "/Weaponry.txt");
        File file = new File(txt.toString());
        
        // Read file
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        Iterator<String> iter = list.iterator();
        List<Weapon> listWeapon = new ArrayList<>();
        iter.next();

        // Iterate through file and store objects
        while (iter.hasNext()) {
            String s = iter.next();
            String[] str = s.split("\\s+");
            Weapon weapon = new Weapon(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
            listWeapon.add(weapon);
        }

        // Return list of Weapons
        return listWeapon;
    }

}