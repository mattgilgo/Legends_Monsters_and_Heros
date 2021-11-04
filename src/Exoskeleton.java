public class Exoskeleton extends Monster {
    
    public Exoskeleton(String name, int level, int attack, int defense, int evade){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Exoskeleton");
        setAttack(attack);
        setDefense(defense);
        setEvade(evade);
        setLevel(level);
        setHP(this.getLevel()*100);
    }

}