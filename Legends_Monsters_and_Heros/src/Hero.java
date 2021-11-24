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

    public Hero(String name, int level, double mana, double strength, double agility, double dexterity, double startMoney, int xp) {
        super(name, level);
        setMana(mana);
        setStrength(strength);
        setAgility(agility);
        setDexterity(dexterity);
        setMoney(startMoney);
    }

    public void faint() {
        // put faint code here
    }

    public double getMana() {
        return this.mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getStrength() {
        return this.strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getAgility() {
        return this.agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getXP() {
        return this.xp;
    }

    public void setXP(double xp) {
        this.xp = xp;
    }

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

    public boolean canHeroReceiveItem(double itemPrice) {
        if (this.getMoney() >= itemPrice) {
            return true;
        } else {
            return false;
        }
    } 

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  HP:" + this.getHP() + "  Level:" + this.getLevel() + "  Mana:" + this.getMana() + "  Strength:" + this.getStrength() + "  Agility:" + this.getAgility() + "  Dexterity:" + this.getDexterity() + "  Money:" + this.getMoney() + "  XP:" + this.getXP());
    }

}