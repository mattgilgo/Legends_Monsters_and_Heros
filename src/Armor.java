/*
* Armor - extends Item implements Wearable, Subclass in Factory design pattern, contains variables and methods for Armor level.
*/
public class Armor extends Item implements Wearable{
    double damageReduc = 0;
    String type = "Armor";

    // Constructor method for Armor
    public Armor(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    // Alternate Constructor method for Armor
    public Armor(String name, int price, int minLevel, int damageReduc){
        super(name, price, minLevel);
        setDamageReduc(damageReduc);
    }

    // Getter for damage reduced upon attack with Armor equipped
    public double getDamageReduc() {
        return this.damageReduc;
    }

    // Setter for damage reduced upon attack with Armor equipped
    public void setDamageReduc(double damageReduc) {
        this.damageReduc = damageReduc;
    }
    
    // Overrides toString method to print out Weapon information
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage Reduction:" + this.getDamageReduc());
    }
}