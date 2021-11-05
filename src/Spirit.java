public class Spirit extends Monster{
    
    public Spirit(String name, int level, int attack, int defense, int evade){
        super(); // way constructor is set up in Hero could create an issue
        setName(name);
        setType("Spirit");
        setAttack(attack);
        setDefense(defense);
        setEvade(evade);
        setLevel(level);
        setHP(this.getLevel()*100);
    }

}