public class Spell extends Item {
    int damage = 0;
    int manaCost = 0;

    public Spell(String name, int price, int minLevel, int damage, int manaCost){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Spell");
        setPrice(price);
        setMinLevel(minLevel);
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
}