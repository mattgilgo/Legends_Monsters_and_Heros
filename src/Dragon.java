public class Dragon extends Monster {
    
    public Dragon(String name, int level, int attack, int defense, int evade){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Dragon");
        setAttack(attack);
        setDefense(defense);
        setEvade(evade);
        setLevel(level);
        setHP(this.getLevel()*100);
    }

}