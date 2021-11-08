/*
* Character - Superclass in Factory design pattern, contains variables and methods for Character level.
*/
public abstract class Character {
    String name = "";
    double hp = 0;
    int level = 0;
    String type = "";

    // Constructor method for Character
    public Character(String name, int level) {
        setName(name);
        setLevel(level);
        setHP();
    }

    // Getter method for Character Name
    public String getName() {
        return this.name;
    }

    // Setter method for Character Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for Character HP
    public double getHP() {
        return this.hp;
    }

    // Setter method for Character HP
    public void setHP() {
        this.hp = (double)this.level*100;
    }

    // Setter method for Character HP with given input HP
    public void setHP(double hp) {
        this.hp = hp;
    }
    
    // Getter method for Character Level
    public int getLevel() {
        return this.level;
    }

    // Setter method for Character Level
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter method for Character Type
    public String getType() {
        return this.type;
    }

    // Setter method for Character Type
    public void setType(String type) {
        this.type = type;
    }
}