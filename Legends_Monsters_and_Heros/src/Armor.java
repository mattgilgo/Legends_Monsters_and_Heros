/*
* Armor - extends Item implements Wearable, Subclass in Factory design pattern, contains variables and methods for Armor level.
*/
public class Armor extends Item implements Wearable{
    double damageReduc = 0;
    String type = "Armor";

    public Armor(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    public Armor(String name, int price, int minLevel, int damageReduc){
        super(name, price, minLevel);
        setDamageReduc(damageReduc);
    }

    public double getDamageReduc() {
        return this.damageReduc;
    }

    public void setDamageReduc(double damageReduc) {
        this.damageReduc = damageReduc;
    }
    
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage Reduction:" + this.getDamageReduc());
    }
}