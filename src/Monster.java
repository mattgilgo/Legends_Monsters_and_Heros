import java.util.*;

public class Monster extends Character {

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

}