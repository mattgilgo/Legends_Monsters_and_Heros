public class IceSpell extends Spell {
    String typeSpell = "IceSpell";
    
    // Constructor method for IceSpell object
    public IceSpell(String name, int price, int minLevel, int damage, int manaCost) {
        super(name, price, minLevel, damage, manaCost);
    }

    // method to initialize an instance of a IceSpell object
    public IceSpell createIceSpell(String name, int price, int minLevel, int damage, int manaCost) {
        IceSpell icy = new IceSpell(name, price, minLevel, damage, manaCost);
        return icy;
    }
}