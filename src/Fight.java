import java.util.*;

public class Fight {
    ArrayList<Hero> heroesFighting;
    ArrayList<Monster> monstersFighting;

    public Fight(ArrayList<Hero> heroes, ArrayList<Monster> monsters) {
        this.heroesFighting = heroes;
        this.monstersFighting = monsters;
    }

    public void doFight() {
        //ArrayList<Integer> hps = new ArrayList<Integer>();
        int heroesHP = 0;
        int monstersHP = 0;
        //for (int s = 0; s < this.heroesFighting.size(); s++) {
        //    hps.add(this.heroesFighting.get(s).getHP());
        //    heroesHP += this.heroesFighting.get(s).getHP();
        //    monstersHP += this.monstersFighting.get(s).getHP();
        //}

        while (heroesHP > 0 && monstersHP > 0) {
            heroesHP = heroesTurn();
            monstersHP = monstersTurn();
        }

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

    public int heroesTurn() {
        // Put logic in for heroes turn, plus logistics on page 4


        // End of round
        int remainingHeroesHP = 0;
        if (this.heroesFighting.size() > 0) {
            for (int i = 0; i < this.heroesFighting.size(); i++) {
                // Alive heroes regain 10% HP and 10% Mana
                this.heroesFighting.get(i).setHP((int)Math.floor(this.heroesFighting.get(i).getHP()*1.1));
                this.heroesFighting.get(i).setMana((int)Math.floor(this.heroesFighting.get(i).getMana()*1.1));
                // Sum remaining Heroes HP
                remainingHeroesHP += this.heroesFighting.get(i).getHP();
            }
        }
        
        return remainingHeroesHP;
    }

    public int monstersTurn() {
        // Put logic in for monsters turn, plus logistics on page 4



            // End of round
            int remainingMonsterHP = 0;
            if (this.monstersFighting.size() > 0) {
                for (int i = 0; i < this.heroesFighting.size(); i++) {
                    // Sum remaining Monsters HP
                    remainingMonsterHP += this.monstersFighting.get(i).getHP();
                }
            }
            
            return remainingMonsterHP;
    }
}