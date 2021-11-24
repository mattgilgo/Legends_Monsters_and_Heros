import java.util.*;

/*
* Fight - Contains methods for performing Hero vs. Monster battles.
*/
public class Fight {
    ArrayList<Hero> heroesFighting;
    ArrayList<Monster> monstersFighting;
    Utility utils = new Utility();

    // Constructor method for a heroes vs. monsters battle.
    public Fight(ArrayList<Hero> heroes, ArrayList<Monster> monsters) {
        this.heroesFighting = heroes;
        this.monstersFighting = monsters;
    }

    // Method for what occurs during a the Heroes' turn in the battle. Outputs Double array of Hero and Monster HP.
    public Double[] heroesTurn() {
        // For each hero used in game, do a turn
        for (int i = 0; i < this.heroesFighting.size(); i++) {

            // Choose from various options for turn
            System.out.println("Hero "+ (i+1) +": What move would you like to make?");
            System.out.println("'1' - Attack");
            System.out.println("'2' - Magic");
            System.out.println("'3' - Potion");
            System.out.println("'4' - Change Equipment");
            int action = this.utils.getInt("Enter choice here: ");

            if (action == 1) {  // If attack is chosen, attack Monster
                double attackPwr = 0;

                if (this.heroesFighting.get(i).heroWeapon.size() > 0) { // If holding a weapon, damage to monster will be this
                    attackPwr = (this.heroesFighting.get(i).getStrength()+this.heroesFighting.get(i).heroWeapon.get(0).getDamage())*0.05;
                } else {    // If not holding a weapon, damage to Monster will be this
                    attackPwr = this.heroesFighting.get(i).getStrength()*0.05;
                }

                // Check if Monster dodged attack
                Random r = new Random();
                boolean check = r.nextInt(100) < this.monstersFighting.get(i).getEvade();
                if (check) { // if the Monster dodged the attack
                    System.out.println("Monster dodged attack!");
                } else { // if the Monster did not dodge the attack
                    this.monstersFighting.get(i).setHP(this.monstersFighting.get(i).getHP()-attackPwr);
                    System.out.println("Hero inflicted " + attackPwr + " damage on Monster!");
                }

            } else if (action == 2) { // If Spell is chosen, use spell on Monster
                if (this.heroesFighting.get(i).heroSpell.size() == 0) { // If Hero has no spells in inventory
                    System.out.println("Your hero cannot cast magic because he has no spells!");
                
                } else { // If hero does have spells in inventory
                    
                    // Check if Monster dodged spell
                    Random r = new Random();
                    boolean check = r.nextInt(100) < this.monstersFighting.get(i).getEvade();

                    if (check) { // if the Monster dodged the spell
                        System.out.println("Monster dodged spell!");

                    } else { // if the Monster did not dodge the spell
        
                        // Choose spell
                        System.out.println("Choose Spell to cast:");
                        for (int k = 0; k < this.heroesFighting.get(i).heroSpell.size(); k++) {
                            System.out.println((k+1) + " - " + this.heroesFighting.get(i).heroSpell.get(k).toString());
                        }
                        int spellChoice = this.utils.getInt("Enter choice: ");
                        double spellPwr = this.heroesFighting.get(i).heroSpell.get(spellChoice-1).getDamage();

                        // Cast spell
                        this.monstersFighting.get(i).setHP(this.monstersFighting.get(i).getHP()-heroesFighting.get(i).heroSpell.get(spellChoice-1).getDamage());
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

            } else if (action == 3) { // If Potion is chosen, use Potion on hero
                if (this.heroesFighting.get(i).heroPotion.size() == 0) { // If Hero has no potions in inventory
                    System.out.println("Your hero cannot take potions because he has none!");
                } else { // If Hero has potions in inventory

                    // Choose potion
                    System.out.println("Choose Potion to use:");
                    for (int k = 0; k < this.heroesFighting.get(i).heroPotion.size(); k++) {
                        System.out.println((k+1) + " - " + this.heroesFighting.get(i).heroPotion.get(k).toString());
                    }
                    int potionChoice = this.utils.getInt("Enter choice: ");
                    double potionPwr = this.heroesFighting.get(i).heroPotion.get(potionChoice-1).getAttrAdded();
                    Potion potionUsed = this.heroesFighting.get(i).heroPotion.get(potionChoice-1);

                    // Use potion
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
                }

            } else if (action == 4) { // If Change Armor/Weapons is chosen
                // Choose to change either Armor or Weapon
                int aOrw = utils.getInt("Enter '1' to change your Armor and '2' to change your Weapon.");
                if (aOrw == 1) { // Change Armor
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
                } else if (aOrw == 2) { // Change Weapon
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
                } else { // Start Armor/Weapon swap over again if player does not pick Armor or Weapon
                    System.out.println("Wrong selection, retry turn!");
                    heroesTurn();
                }
            } else { // Start turn over again if player does not pick between Attack, Spell, Potion, or Change Armor/Weapon
                System.out.println("Wrong selection, retry turn!");
                heroesTurn();
            }
        } 

        // End of round HP checks
        double remainingHeroesHP = 0;
        double remainingMonstersHP = 0;
        System.out.println("");
        if (this.heroesFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Alive heroes regain 10% HP and 10% Mana
                this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP()*1.1);
                this.heroesFighting.get(i).setMana(this.heroesFighting.get(i).getMana()*1.1);
                // Sum remaining Heroes HP
                remainingHeroesHP += this.heroesFighting.get(i).getHP();
                System.out.println("Hero " + (i+1) + "'s remaining health: " + this.heroesFighting.get(i).getHP() + " HP.");
            }
            for (int i = 0; i < this.monstersFighting.size(); i++) {
                // Sum remaining Monsters HP
                remainingMonstersHP += this.monstersFighting.get(i).getHP();
                System.out.println("Monsters " + (i+1) + "'s remaining health: " + this.monstersFighting.get(i).getHP() + " HP.");
            }
        }
        System.out.println("");

        // Array of type Double for returning Hero and Monster HP after Heroes' turn
        Double[] ar = new Double[2];
        ar[0] = remainingHeroesHP;
        ar[1] = remainingMonstersHP;
        return ar;
    }

    // Method for what occurs during a the Monsters' turn in the battle. Outputs Double array of Hero and Monster HP.
    public Double[] monstersTurn() {
        for (int i = 0; i < this.monstersFighting.size(); i++) {
            Random r = new Random();
            int ran = r.nextInt(100);
            // Check if Hero dodges monsters attack. Purposefully lower than requirement due to battles taking too long.
            boolean check = ran < this.heroesFighting.get(i).getAgility()*0.1;
            if (check) {
                System.out.println("Hero dodged attack!");
            } else {
                this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getHP() - this.monstersFighting.get(i).getAttack());
                System.out.println("Monster inflicted " + this.monstersFighting.get(i).getAttack() + " damage on Hero!");
            }
        }

        // End of round HP checks
        double remainingHeroesHP = 0;
        double remainingMonsterHP = 0;
        System.out.println("");
        if (this.monstersFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Sum remaining Heroes HP
                remainingHeroesHP += this.heroesFighting.get(i).getHP();
                System.out.println("Heroes " + (i+1) + "'s remaining health: " + this.heroesFighting.get(i).getHP() + " HP.");
            }
            for (int i = 0; i < this.monstersFighting.size(); i++) {
                // Sum remaining Monsters HP
                remainingMonsterHP += this.monstersFighting.get(i).getHP();
                System.out.println("Monsters " + (i+1) + "'s remaining health: " + this.monstersFighting.get(i).getHP() + " HP.");
            }
        }
        System.out.println("");

    // Array of type Double for returning Hero and Monster HP after Heroes' turn
        Double[] ar = new Double[2];
        ar[0] = remainingHeroesHP;
        ar[1] = remainingMonsterHP;
        return ar;
    }

    // Acts as main method for Fight class. Call this on Fight Object to begin fight.
    public void doFight() {
        double heroesHP = 0;
        double monstersHP = 0;

        // Sum starting HP up for heroes
        if (this.heroesFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Sum remaining Heroes HP
                heroesHP += this.heroesFighting.get(i).getHP();
            }
        }

        // Sum starting HP up for heroes
        if (this.monstersFighting.size() > 0) {
            for (int i = 0; i < this.monstersFighting.size(); i++) {
                // Sum remaining Heroes HP
                monstersHP += this.monstersFighting.get(i).getHP();
                System.out.println("A wild " + this.monstersFighting.get(i).getName() + " appeared!");
            }
        }

        // For Rounds of Fight
        while (heroesHP > 0 && monstersHP > 0) {
            Double[] hHP = heroesTurn();
            if (hHP[1] <= 0) {
                System.out.println("HEROES WIN!!!");
                System.out.println("");
                break;
            }
            Double[] mHP = monstersTurn();
            if (mHP[0] <= 0) {
                System.out.println("MONSTERS WIN!!!");
                System.out.println("");
                break;
            } 
        }

        // Post-Fight
        if (heroesHP <= 0) {    // If the monsters win
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Take away half of the heroes money
                this.heroesFighting.get(i).setHP(this.heroesFighting.get(i).getLevel()*100/2);
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