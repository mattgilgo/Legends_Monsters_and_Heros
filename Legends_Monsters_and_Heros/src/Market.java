import java.io.FileNotFoundException;
import java.util.*;

/*
* Market - Contains all methods relating to a Market, include constructor method, random inventory initialization, and removing items from inventory.
*/
public class Market {
    ArrayList<Item> inventory;
    

    Utility utils = new Utility();
    
    // Constructor method for Market object
    public Market() throws FileNotFoundException {
        this.inventory = new ArrayList<Item>();
        createMarketInventory();
    }

    public void createMarketInventory() throws FileNotFoundException {
        TxtParse parser = new TxtParse();
        List<Armor> listArmor = parser.parseArmor();
        List<Potion> listPotion = parser.parsePotion();
        List<FireSpell> listFireSpell = parser.parseFireSpell();
        List<IceSpell> listIceSpell = parser.parseIceSpell();
        List<LightningSpell> listLightningSpell = parser.parseLightningSpell();
        List<Weapon> listWeapon = parser.parseWeapon();

        for (int i = 0; i < listArmor.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listArmor.get(i).setType("Armor");
                this.inventory.add(listArmor.get(i));
            }
        }
        for (int i = 0; i < listPotion.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listPotion.get(i).setType("Potion");
                this.inventory.add(listPotion.get(i));
            }
        }
        for (int i = 0; i < listFireSpell.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listFireSpell.get(i).setType("Spell");
                this.inventory.add(listFireSpell.get(i));
            }
        }
        for (int i = 0; i < listIceSpell.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listIceSpell.get(i).setType("Spell");
                this.inventory.add(listIceSpell.get(i));
            }
        }
        for (int i = 0; i < listLightningSpell.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listLightningSpell.get(i).setType("Spell");
                this.inventory.add(listLightningSpell.get(i));
            }
        }
        for (int i = 0; i < listWeapon.size(); i++) {
            Random r = new Random();
            boolean check = r.nextInt(100) < 33;
            if (check) {
                listWeapon.get(i).setType("Weapon");
                this.inventory.add(listWeapon.get(i));
            }
        }
    }

    public void printMarketInventory() {
        for (int i = 0; i < this.inventory.size(); i++) {
            System.out.println("'"+(i+1)+"'" + " = " + this.inventory.get(i).toString());
        }
    }
    
    // Method for buying item from market
    public Item getItem(int index) {
        Item item = this.inventory.get(index);
        this.inventory.remove(index);
        return item;
    }

    // Method for stocking/selling item from market
    public void stockItem(Item stock) {
        this.inventory.add(stock);
    }

    public ArrayList<Hero> shoppingTrip(ArrayList<Hero> heroesList) {
        String check = "";
        while (!check.equals("exit")) {
            System.out.println("Choose from the list of market inventory below:");
            printMarketInventory();
            int itemChoice = utils.getInt("Enter Item Number you would like to equip, or enter 999 to leave Market.");
            if (itemChoice > 0 && itemChoice <= this.inventory.size()) {
                for (int i = 0; i < heroesList.size(); i++) {
                    System.out.println("'"+(i+1)+"'" + " = " + heroesList.get(i).toString());
                }
                int heroIndex = utils.getInt("Which Hero would you like to equip this item too?");
                if (heroesList.get(heroIndex-1).canHeroReceiveItem(this.inventory.get(itemChoice).getPrice())) {

                    if (this.inventory.get(itemChoice).getType().equals("Armor")) {
                        heroesList.get(heroIndex-1).heroArmor.add((Armor)getItem(itemChoice-1));
                    } else if (this.inventory.get(itemChoice).getType().equals("Potion")) {
                        heroesList.get(heroIndex-1).heroPotion.add((Potion)getItem(itemChoice-1));
                    } else if (this.inventory.get(itemChoice).getType().equals("Spell")) {
                        heroesList.get(heroIndex-1).heroSpell.add((Spell)getItem(itemChoice-1));
                    } else {
                        heroesList.get(heroIndex-1).heroWeapon.add((Weapon)getItem(itemChoice-1));
                    }
                } else {
                    System.out.println("That hero cannot receive that item!");
                }  
            } else if (itemChoice == 999) {
                check = "exit";
            } else {
                continue;
            }
        }

        return heroesList;
    }

}