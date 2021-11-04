public class Potion extends Item {
    int attrAdded = 0;
    String attrAffected = "";

    public Potion(String name, int price, int minLevel, int attrAdded, String attrAffected){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Potion");
        setPrice(price);
        setMinLevel(minLevel);
        setAttrAdded(attrAdded);
        setAttrAffected(attrAffected);
    }

    public int getAttrAdded() {
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
}