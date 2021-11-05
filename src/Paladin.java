public class Paladin extends Hero {
    public Paladin(String name, int hp, int level, String type, int mana, int strength, int agility, int dexterity, int startMoney, int xp){
        super(name, hp, level, type, mana, strength, agility, dexterity, startMoney, xp); 
        setLevel(1);
        setHP(this.getLevel()*100);
    }
}