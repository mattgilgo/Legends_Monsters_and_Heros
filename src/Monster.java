import java.util.*;

public class Monster extends Character {
    int attack = 0;
    int defense = 0;
    int evade = 0;
    
    public Monster() {
        super();
    }

    public Monster createMonster(String type) {
        if (type.equals("Dragon")) {
            return new Dragon();
        } else if (type.equals("Exoskeleton")) {
            return new Exoskeleton();
        } else if (type.equals("Spirit")) {
            return new Spirit();
        } else {
            return null;
        }
    }

    public void faint() {
        // put faint code here
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getEvade() {
        return this.evade;
    }

    public void setEvade(int evade) {
        this.evade = evade;
    }
}