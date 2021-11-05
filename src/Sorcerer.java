public class Sorcerer extends Hero{
    public Sorcerer(String name, int mana, int strength, int agility, int dexterity, int startMoney, int xp){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Sorcerer");
        setMana(mana);
        setStrength(strength);
        setDexterity(dexterity);
        setAgility(agility);
        setMoney(startMoney);
        setXP(xp);
        setLevel(1);
        setHP(this.getLevel()*100);
    }
}