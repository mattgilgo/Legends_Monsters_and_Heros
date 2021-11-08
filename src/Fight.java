import java.util.*;

public class Fight {
    ArrayList<Hero> heroesFighting;
    ArrayList<Monster> monstersFighting;
    Utility utils = new Utility();

    public Fight(ArrayList<Hero> heroes, ArrayList<Monster> monsters) {
        this.heroesFighting = heroes;
        this.monstersFighting = monsters;
    }

    public double heroesTurn() {
        for (int i = 0; i < this.heroesFighting.size(); i++) {
            System.out.println("Hero "+ (i+1) +": What move would you like to make?");
            System.out.println("'1' - Attack");
            System.out.println("'2' - Magic");
            System.out.println("'3' - Potion");
            System.out.println("'4' - Change Equipment");
            int action = this.utils.getInt("Enter choice here: ");
            if (action == 1) {
                double attackPwr = (this.heroesFighting.get(i).getStrength()+this.heroesFighting.get(i).heroWeapon.get(0).getDamage())*0.05;
                Random r = new Random();
                boolean check = r.nextInt(100) < this.monstersFighting.get(i).getEvade();
                if (check) {
                    System.out.println("Monster dodged attack!");
                } else {
                    this.monstersFighting.get(i).setHP(this.monstersFighting.get(i).getHP()-attackPwr);
                    System.out.println("Hero inflicted " + attackPwr + " damage on Monster!");
                }
            } else if (action == 2) {
                if (this.heroesFighting.get(i).heroSpell.size() == 0) {
                    System.out.println("Your hero cannot cast magic because he has no spells!");
                } else {
                    Random r = new Random();
                    boolean check = r.nextInt(100) < this.monstersFighting.get(i).getEvade();
                    if (check) {
                        System.out.println("Monster dodged spell!");
                    } else {
                        System.out.println("Choose Spell to cast:");
                        for (int k = 0; k < this.heroesFighting.get(i).heroSpell.size(); k++) {
                            System.out.println((k+1) + " - " + this.heroesFighting.get(i).heroSpell.get(k).toString());
                        }
                        int spellChoice = this.utils.getInt("Enter choice: ");
                        double spellPwr = this.heroesFighting.get(i).heroSpell.get(spellChoice-1).getDamage();
                        this.monstersFighting.get(i).setHP(this.monstersFighting.get(i).getHP()-heroesFighting.get(i).heroSpell.get(spellChoice-1).getDamage());
                        //if (this.heroesFighting.get(i).heroSpell.get(spellChoice-1).
                        Random ra = new Random();
                        int ran = ra.nextInt(3);
                        if (ran == 1) {
                            this.monstersFighting.get(i).setAttack(this.monstersFighting.get(i).getAttack()*0.9);
                            System.out.println("Hero inflicted " + spellPwr + " damage and dropped the Monster's attack stat by 10%!");
                        } else if (ran == 2) {
                            this.monstersFighting.get(i).setDefense(this.monstersFighting.get(i).getDefense()*0.9);
                            System.out.println("Hero inflicted " + spellPwr + " damage and dropped the Monster's defense stat by 10%!");
                        } else {
                            this.monstersFighting.get(i).setEvade(this.monstersFighting.get(i).getEvade()*0.9);
                            System.out.println("Hero inflicted " + spellPwr + " damage and dropped the Monster's evade stat by 10%!");
                        }
                    }
                }
            } else if (action == 3) {
                System.out.println("Choose Potion to use:");
                for (int k = 0; k < this.heroesFighting.get(i).heroPotion.size(); k++) {
                    System.out.println((k+1) + " - " + this.heroesFighting.get(i).heroPotion.get(k).toString());
                }
                int potionChoice = this.utils.getInt("Enter choice: ");
                double potionPwr = this.heroesFighting.get(i).heroPotion.get(potionChoice-1).getAttrAdded();
                Potion potionUsed = this.heroesFighting.get(i).heroPotion.get(potionChoice-1);
                if (potionUsed.getName().equals("Ambrosia")) {
                    this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP()+potionPwr);
                    this.heroesFighting.get(i).setMana(this.heroesFighting.get(i).getMana()+potionPwr);
                    this.heroesFighting.get(i).setStrength(this.heroesFighting.get(i).getStrength()+potionPwr);
                    this.heroesFighting.get(i).setDexterity(this.heroesFighting.get(i).getDexterity()+potionPwr);
                    this.heroesFighting.get(i).setAgility(this.heroesFighting.get(i).getAgility()+potionPwr);
                    System.out.println("All Hero's stats increased by " + potionPwr);
                } else if (potionUsed.getName().equals("Mermaid_Tears")) {
                    this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP()+potionPwr);
                    this.heroesFighting.get(i).setMana(this.heroesFighting.get(i).getMana()+potionPwr);
                    this.heroesFighting.get(i).setStrength(this.heroesFighting.get(i).getStrength()+potionPwr);
                    this.heroesFighting.get(i).setAgility(this.heroesFighting.get(i).getAgility()+potionPwr);
                    System.out.println("Hero's health, mana, strength, and agility stats increased by " + potionPwr);
                } else if (potionUsed.getName().equals("Luck_Elixir")) {
                    this.heroesFighting.get(i).setAgility(this.heroesFighting.get(i).getAgility()+potionPwr);
                    System.out.println("Hero's Agility stat increased by " + potionPwr);
                } else if (potionUsed.getName().equals("Magic_Potion")) {
                    this.heroesFighting.get(i).setMana(this.heroesFighting.get(i).getMana()+potionPwr);
                    System.out.println("Hero's Mana increased by " + potionPwr);
                } else if (potionUsed.getName().equals("Strength_Potion")) {
                    this.heroesFighting.get(i).setStrength(this.heroesFighting.get(i).getStrength()+potionPwr);
                    System.out.println("Hero's Strength stat increased by " + potionPwr);
                } else {
                    this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP()+potionPwr);
                    System.out.println("Hero's HP increased by " + potionPwr);
                }
            } else if (action == 4) {
                int aOrw = utils.getInt("Enter '1' to change your Armor and '2' to change your Weapon.");
                if (aOrw == 1) {
                    System.out.println("Choose which Armor you would like to use");
                    for (int g = 0; g < this.heroesFighting.get(i).heroArmor.size(); g++) {
                        System.out.println((g+1) + " - " + this.heroesFighting.get(i).heroArmor.get(g).toString());
                    } 
                    int armorPick = utils.getInt("Enter Armor to use: ");
                    Armor oldA = this.heroesFighting.get(i).heroArmor.get(0);
                    Armor newA = this.heroesFighting.get(i).heroArmor.get(armorPick-1);
                    this.heroesFighting.get(i).heroArmor.remove(armorPick-1);
                    this.heroesFighting.get(i).heroArmor.remove(0);
                    this.heroesFighting.get(i).heroArmor.add(0, newA);
                    this.heroesFighting.get(i).heroArmor.add(armorPick-1, oldA);
                    System.out.println("New Armor equipped!");
                } else if (aOrw == 2) {
                    System.out.println("Choose which Weapon you would like to use");
                    for (int g = 0; g < this.heroesFighting.get(i).heroWeapon.size(); g++) {
                        System.out.println((g+1) + " - " + this.heroesFighting.get(i).heroWeapon.get(g).toString());
                    } 
                    int armorPick = utils.getInt("Enter Weapon to use: ");
                    Weapon oldW = this.heroesFighting.get(i).heroWeapon.get(0);
                    Weapon newW = this.heroesFighting.get(i).heroWeapon.get(armorPick-1);
                    this.heroesFighting.get(i).heroWeapon.remove(armorPick-1);
                    this.heroesFighting.get(i).heroWeapon.remove(0);
                    this.heroesFighting.get(i).heroWeapon.add(0, newW);
                    this.heroesFighting.get(i).heroWeapon.add(armorPick-1, oldW);
                    System.out.println("New Weapon equipped!");
                } else {
                    System.out.println("Wrong selection, retry turn!");
                    heroesTurn();
                }
            } else {
                System.out.println("Wrong selection, retry turn!");
                heroesTurn();
            }
        } 

        // End of round
        double remainingHeroesHP = 0;
        if (this.heroesFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Alive heroes regain 10% HP and 10% Mana
                this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP()*1.1);
                this.heroesFighting.get(i).setMana(this.heroesFighting.get(i).getMana()*1.1);
                // Sum remaining Heroes HP
                remainingHeroesHP += this.heroesFighting.get(i).getHP();
            }
        }
        
        return remainingHeroesHP;
    }

    public double monstersTurn() {
        // Put logic in for monsters turn, plus logistics on page 4
        for (int i = 0; i < this.monstersFighting.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < this.heroesFighting.get(i).getAgility()*0.2;
            if (check) {
                System.out.println("Hero dodged attack!");
            } else {
                this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP() - this.monstersFighting.get(i).getAttack());
                System.out.println("Monster inflicted " + this.monstersFighting.get(i).getAttack() + " damage on Hero!");
            }
        }

        // End of round
        double remainingMonsterHP = 0;
        if (this.monstersFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Sum remaining Monsters HP
                remainingMonsterHP += this.monstersFighting.get(i).getHP();
            }
        }
        
        return remainingMonsterHP;
    }

    public void doFight() {
        //ArrayList<Integer> hps = new ArrayList<Integer>();
        double heroesHP = 0;
        double monstersHP = 0;

        // For Rounds of Fight
        while (heroesHP > 0 && monstersHP > 0) {
            heroesHP = heroesTurn();
            monstersHP = monstersTurn();
        }

        // Post-Fight
        if (heroesHP <= 0) {    // If the monsters win
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Take away half of the heroes money
                this.heroesFighting.get(i).setMoney(this.heroesFighting.get(i).getMoney()/2);
            }
        } else if (monstersHP <= 0) { // If the heroes win
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                if (this.heroesFighting.get(i).getHP() > 0) {
                    // Heroes that didn't faint get money and XP
                    this.heroesFighting.get(i).setMoney(this.monstersFighting.get(i).getLevel()*100);
                    this.heroesFighting.get(i).setXP(this.heroesFighting.get(i).getXP()+2);
                } else {
                    this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getLevel()*100/2);
                }
            }
        }
    }
}