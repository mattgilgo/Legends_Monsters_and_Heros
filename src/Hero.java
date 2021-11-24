import java.io.FileNotFoundException;
import java.util.*;

/*
* Hero - extends Character, Subclass and parent in Factory design pattern, contains variables and methods for Hero level.
*/
public class Hero extends Character {
    double mana = 0;
    double strength = 0;
    double dexterity = 0;
    double agility = 0;
    double money = 0;
    double xp = 0;
    ArrayList<Armor> heroArmor = new ArrayList<Armor>();
    ArrayList<Potion> heroPotion = new ArrayList<Potion>();
    ArrayList<Spell> heroSpell = new ArrayList<Spell>();
    ArrayList<Weapon> heroWeapon = new ArrayList<Weapon>();
    Utility utils = new Utility();

    // Constructor method for Hero
    public Hero(String name, int level, double mana, double strength, double agility, double dexterity, double startMoney, int xp) {
        super(name, level);
        setMana(mana);
        setStrength(strength);
        setAgility(agility);
        setDexterity(dexterity);
        setMoney(startMoney);
    }
    
    // Getter method for Hero Mana
    public double getMana() {
        return this.mana;
    }

    // Setter method for Hero Mana
    public void setMana(double mana) {
        this.mana = mana;
    }

    // Getter method for Hero Strength
    public double getStrength() {
        return this.strength;
    }

    // Setter method for Hero Strength
    public void setStrength(double strength) {
        this.strength = strength;
    }

    // Getter method for Hero Dexterity
    public double getDexterity() {
        return this.dexterity;
    }

    // Setter method for Hero Dexterity
    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    // Getter method for Hero Agility
    public double getAgility() {
        return this.agility;
    }

    // Setter method for Hero Agility
    public void setAgility(double agility) {
        this.agility = agility;
    }

    // Getter method for Hero Money
    public double getMoney() {
        return this.money;
    }

    // Setter method for Hero Money
    public void setMoney(double money) {
        this.money = money;
    }

    // Getter method for Hero XP
    public double getXP() {
        return this.xp;
    }

    // Setter method for Hero XP
    public void setXP(double xp) {
        this.xp = xp;
    }

    // Method for game players to see which Heroes they can choose from at the begining of the game
    public void chooseHeroesOptions() throws FileNotFoundException {
        TxtParse parser = new TxtParse();
        List<Warrior> listWarrior = parser.parseWarrior();
        List<Sorcerer> listSorcerer = parser.parseSorcerer();
        List<Paladin> listPaladin = parser.parsePaladin();

        for (int i = 0; i < listWarrior.size(); i++) {
            System.out.println("'"+(i+1)+"'" + " = " + listWarrior.get(i).toString());
        }
        for (int i = 0; i < listSorcerer.size(); i++) {
            System.out.println("'"+(i+6)+"'" + " = " + listSorcerer.get(i).toString());
        }
        for (int i = 0; i < listPaladin.size(); i++) {
            System.out.println("'"+(i+10)+"'" + " = " + listPaladin.get(i).toString());
        }
    }

    // Method to check whether or not the Hero can afford a selected item in the Market
    public boolean canHeroReceiveItem(double itemPrice) {
        if (this.getMoney() >= itemPrice) {
            return true;
        } else {
            return false;
        }
    } 

    // Overrides toString method to print out Weapon information
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  HP:" + this.getHP() + "  Level:" + this.getLevel() + "  Mana:" + this.getMana() + "  Strength:" + this.getStrength() + "  Agility:" + this.getAgility() + "  Dexterity:" + this.getDexterity() + "  Money:" + this.getMoney() + "  XP:" + this.getXP());
    }

}