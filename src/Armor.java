public class Armor extends Item {
    int damageReduc = 0;

    public Armor(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }

    public Armor(String name, int price, int minLevel, int damageReduc){
        super(name, price, minLevel);
        setDamageReduc(damageReduc);
    }

    public int getDamageReduc() {
        return this.damageReduc;
    }

    public void setDamageReduc(int damageReduc) {
        this.damageReduc = damageReduc;
    }
    
    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage Reduction:" + this.getDamageReduc());
    }
}