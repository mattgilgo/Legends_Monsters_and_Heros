/*
* FireSpell - extends Spell, Subclass in Factory design pattern, contains variables and methods for FireSpell level.
*/
public class FireSpell extends Spell {
    String typeSpell = "FireSpell";
    
    // Constructor method for FireSpell object
    public FireSpell(String name, int price, int minLevel, int damage, int manaCost) {
        super(name, price, minLevel, damage, manaCost);
    }

    // method to initialize an instance of a FireSpell object
    public FireSpell createFireSpell(String name, int price, int minLevel, int damage, int manaCost) {
        FireSpell fiya = new FireSpell(name, price, minLevel, damage, manaCost);
        return fiya;
    }
}