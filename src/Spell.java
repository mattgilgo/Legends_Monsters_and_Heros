public class Spell extends Item {
    int damage = 0;
    int manaCost = 0;

    public Spell(String name, int price, int minLevel) {
        super(name, price, minLevel);
    }
    
    public Spell(String name, int price, int minLevel, int damage, int manaCost){
        super(name, price, minLevel);
        setDamage(damage);
        setManaCost(manaCost);
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getManaCost() {
        return this.manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  Cost:" + this.getPrice() + "  Required Level:" + this.getMinLevel() + "  Damage:" + this.getDamage() + "  Mana Cost:" + this.getManaCost());
    }
}