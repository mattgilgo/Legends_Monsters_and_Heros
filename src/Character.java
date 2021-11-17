public abstract class Character {
    String name = "";
    int hp = 0;
    int level = 0;
    String type = "";

    public Character(String name, int level) {
        setName(name);
        setLevel(level);
        setHP();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP() {
        this.hp = this.level*100;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }
    
    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}