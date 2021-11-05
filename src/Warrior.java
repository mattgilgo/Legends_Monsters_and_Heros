public class Warrior extends Hero {
    
    public Warrior(String name, int hp, int level, String type, int mana, int strength, int agility, int dexterity, int startMoney, int xp){
        super(name, hp, level, type, mana, strength, agility, dexterity, startMoney, xp); // way constructor is set up in Hero could create an issue
        setLevel(1);
        setHP(this.getLevel()*100);
    }
    
}