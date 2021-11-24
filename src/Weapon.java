/*
* Weapon - extends Item implements Holdable, Subclass in Factory design pattern, contains variables and methods for Weapon level.
*/
public class Weapon extends Item implements Holdable {
    double damage = 0;
    int reqHands = 0;
    String type = "Weapon";

    // Constructor method for Weapon
    public Weapon(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    // Alternate Constructor method for Weapon
    public Weapon(String name, int price, int minLevel, int damage, int reqHands){
        super(name, price, minLevel);
        setDamage(damage);
        setReqHands(reqHands);
    }

    // Getter method for damage
    public double getDamage() {
        return this.damage;
    }

    // Setter method for damage
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Getter method for open hands needed for Hero to use weapon
    public int getReqHands() {
        return this.reqHands;
    }

    // Setter method for open hands needed for Hero to use weapon
    public void setReqHands(int reqHands) {
        this.reqHands = reqHands;
    }
    
    // Overrides toString method to print out Weapon information
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage:" + this.getDamage() + "  Required Hands:" + this.getReqHands());
    }
}
