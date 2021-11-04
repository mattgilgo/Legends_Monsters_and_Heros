import java.util.*;

public class Monster extends Character {
    int mana = 0;
    int strength = 0;
    int dexterity = 0;
    int agility = 0;
    int money = 0;
    int xp = 0;
    
    public Monster() {
        super();
    }

    public Monster createMonster(String type) {
        if (type.equals("Dragon")) {
            return new Dragon();
        } else if (type.equals("Exoskeletons")) {
            return new Sorcerer();
        } else if (type.equals("Spirits")) {
            return new Paladin();
        } else {
            return null;
        }
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
}