/*
* Item - Superclass in Factory design pattern, contains variables and methods for Item level.
*/
public class Item {
    String name = "";
    int price = 0;
    int minLevel = 0;
    String type = "Item";

    // Constructor method for Item
    public Item(String name, int price, int minLevel) {
        setName(name);
        setPrice(price);
        setMinLevel(minLevel);
    }

    // Getter method for item name
    public String getName() {
        return this.name;
    }

    // Setter method for item name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for item price
    public int getPrice() {
        return this.price;
    }

    // Setter method for item price
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter method for minimum level required by Hero to use Item
    public int getMinLevel() {
        return this.minLevel;
    }

    // Setter method for minimum level required by Hero to use Item
    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    // Getter method for Item type
    public String getType() {
        return this.type;
    }

    // Setter method for Item type
    public void setType(String type) {
        this.type = type;
    }

}