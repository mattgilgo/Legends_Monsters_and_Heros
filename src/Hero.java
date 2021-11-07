import java.io.FileNotFoundException;
import java.util.*;

public class Hero extends Character {
    int mana = 0;
    int strength = 0;
    int dexterity = 0;
    int agility = 0;
    int money = 0;
    int xp = 0;
    int[][] currentSpace = {{0},{0}};

    public Hero(String name, int level, int mana, int strength, int agility, int dexterity, int startMoney, int xp) {
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

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getMoney() {
        return this.agility;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getXP() {
        return this.xp;
    }

    public void setXP(int xp) {
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

    public boolean canHeroReceiveItem(int itemPrice) {
        if (this.money >= itemPrice) {
            return true;
        } else {
            return false;
        }
    } 

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  HP:" + this.getHP() + "  Level:" + this.getLevel() + "  Start Mana:" + this.getMana() + "  Strength:" + this.getStrength() + "  Agility:" + this.getAgility() + "  Dexterity:" + this.getDexterity() + "  Start Money:" + this.getMoney() + "  Starting XP:" + this.getXP());
    }

}