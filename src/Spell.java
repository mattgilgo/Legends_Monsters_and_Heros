public class Spell extends Item {
    int damage = 0;
    int manaCost = 0;

    public Spell(String name, int price, int minLevel, int damage, int manaCost){
        String type = "Potion";
        super(name, type); // way constructor is set up in Hero could create an issue
        if (type.equals("FireSpell")) {
            return new FireSpell(name, price, minLevel, damage, manaCost);
        } else if (type.equals("IceSpell")) {

        } else if (type.equals("LightningSpell")) {

        } else {
            return null;
        }
    }

    public Spell createSpell(String name, String type) {

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