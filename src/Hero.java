import java.util.*;

public class Hero extends Character {

    public Hero createHero(String type) {
        if (type.equals("Warrior")) {
            return new Warrior();
        } else if (type.equals("Sorcerer")) {
            return new Sorcerer();
        } else if (type.equals("Paladin")) {
            return new Paladin();
        } else {
            return null;
        }
    }

}