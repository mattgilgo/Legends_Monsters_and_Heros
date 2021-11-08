public class Weapon extends Item {
    double damage = 0;
    int reqHands = 0;
    String type = "Weapon";

    public Weapon(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    public Weapon(String name, int price, int minLevel, int damage, int reqHands){
        super(name, price, minLevel);
        setDamage(damage);
        setReqHands(reqHands);
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getReqHands() {
        return this.reqHands;
    }

    public void setReqHands(int reqHands) {
        this.reqHands = reqHands;
    }
    
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage:" + this.getDamage() + "  Required Hands:" + this.getReqHands());
    }
}
