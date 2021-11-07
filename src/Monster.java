

public class Monster extends Character{
    int attack = 0;
    int defense = 0;
    int evade = 0;
    
    public Monster(String name, int level, int attack, int defense, int evade) {
        super(name, level);
        setAttack(attack);
        setDefense(defense);
        setEvade(evade);
    }

    public void faint() {
        // put faint code here
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getEvade() {
        return this.evade;
    }

    public void setEvade(int evade) {
        this.evade = evade;
    }

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  HP:" + this.getHP() + "  Level:" + this.getLevel() + "  Attack:" + this.getAttack() + "  Defense:" + this.getDefense() + "  Evade:" + this.getEvade());
    }

}