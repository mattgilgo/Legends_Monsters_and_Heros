/*
* Potion - extends Item, Subclass in Factory design pattern, contains variables and methods for Potion level.
*/
public class Potion extends Item {
    double attrAdded = 0;
    String attrAffected = "";
    String type = "Potion";

    public Potion(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    public Potion(String name, int price, int minLevel, int attrAdded, String attrAffected){
        super(name, price, minLevel);
        setAttrAdded(attrAdded);
        setAttrAffected(attrAffected);
    }

    public double getAttrAdded() {
        return this.attrAdded;
    }

    public void setAttrAdded(int attrAdded) {
        this.attrAdded = attrAdded;
    }

    public String getAttrAffected() {
        return this.attrAffected;
    }

    public void setAttrAffected(String attrAffected) {
        this.attrAffected = attrAffected;
    }

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Attribute Increase:" + this.getAttrAdded() + "  Attribute Affected:" + this.getAttrAffected());
    }
}