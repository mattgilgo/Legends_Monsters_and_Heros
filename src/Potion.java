/*
* Potion - extends Item, Subclass in Factory design pattern, contains variables and methods for Potion level.
*/
public class Potion extends Item {
    double attrAdded = 0;
    String attrAffected = "";
    String type = "Potion";

    // Constructor method for Potion
    public Potion(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    // Alternate Constructor method for Potion
    public Potion(String name, int price, int minLevel, int attrAdded, String attrAffected){
        super(name, price, minLevel);
        setAttrAdded(attrAdded);
        setAttrAffected(attrAffected);
    }

    // Getter method for Hero attribute points added by Potion
    public double getAttrAdded() {
        return this.attrAdded;
    }

    // Setter method for Hero attribute points added by Potion
    public void setAttrAdded(int attrAdded) {
        this.attrAdded = attrAdded;
    }

    // Getter method for which attributes on Hero will be increased by Potion
    public String getAttrAffected() {
        return this.attrAffected;
    }

    // Setter method for which attributes on Hero will be increased by Potion
    public void setAttrAffected(String attrAffected) {
        this.attrAffected = attrAffected;
    }

    // Overrides toString method to print out Weapon information
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Attribute Increase:" + this.getAttrAdded() + "  Attribute Affected:" + this.getAttrAffected());
    }
}