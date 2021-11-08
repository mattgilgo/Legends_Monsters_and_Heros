/*
* Spell - extends Item, Subclass and parent in Factory design pattern, contains variables and methods for Spell level.
*/
public class Spell extends Item {
    double damage = 0;
    double manaCost = 0;
    String type = "Spell";

    // Constructor method for Spell
    public Spell(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }
    
    // Alternate Constructor method for Spell
    public Spell(String name, int price, int minLevel, int damage, int manaCost){
        super(name, price, minLevel);
        setDamage(damage);
        setManaCost(manaCost);
    }

    // Getter method for damage done to Monster by Spell
    public double getDamage() {
        return this.damage;
    }

    // Setter method for damage done to Monster by Spell
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Getter method for mana cost to Hero by Spell
    public double getManaCost() {
        return this.manaCost;
    }

    // Getter method for mana cost to Hero by Spell
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    // Overrides toString method to print out Weapon information
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage:" + this.getDamage() + "  Mana Cost:" + this.getManaCost());
    }
}