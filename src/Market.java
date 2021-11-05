import java.util.*;

public class Market {
    ArrayList<Item> inventory;
    
    // Constructor method for Market object
    public Market() {
        this.inventory = new ArrayList<Item>();
    }
    
    // Method for buying item from market
    public Item getItem(int index) {
        return this.inventory.get(index);
    }

    // Method for stocking/selling item from market
    public void stockItem(Item stock) {
        this.inventory.add(stock);
    }

}