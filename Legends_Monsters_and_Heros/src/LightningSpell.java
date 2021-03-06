/*
* LightningSpell - extends Spell, Subclass in Factory design pattern, contains variables and methods for LightningSpell level.
*/
public class LightningSpell extends Spell {
    String typeSpell = "LightningSpell";

        // Constructor method for LightningSpell object
        public LightningSpell(String name, int price, int minLevel, int damage, int manaCost) {
            super(name, price, minLevel, damage, manaCost);
        }
    
        // method to initialize an instance of a LightningSpell object
        public LightningSpell createLightningSpell(String name, int price, int minLevel, int damage, int manaCost) {
            LightningSpell kachow = new LightningSpell(name, price, minLevel, damage, manaCost);
            return kachow;
        }
    
}