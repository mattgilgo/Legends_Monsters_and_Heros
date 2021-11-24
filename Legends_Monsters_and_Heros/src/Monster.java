/*
* Monster - extends Character, Subclass and parent in Factory design pattern, contains variables and methods for Monster level.
*/
public class Monster extends Character{
    double attack = 0;
    double defense = 0;
    double evade = 0;
    
    public Monster(String name, int level, double attack, double defense, double evade) {
        super(name, level);
        setAttack(attack);
        setDefense(defense);
        setEvade(evade);
    }

    public void faint() {
        // put faint code here
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return this.defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getEvade() {
        return this.evade;
    }

    public void setEvade(double evade) {
        this.evade = evade;
    }

    @Override
    public String toString() {
        return ("Name:" + this.getName() +"  HP:" + this.getHP() + "  Level:" + this.getLevel() + "  Attack:" + this.getAttack() + "  Defense:" + this.getDefense() + "  Evade:" + this.getEvade());
    }

}