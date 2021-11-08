public class Item {
    String name = "";
    int price = 0;
    int minLevel = 0;
    String type = "Item";

    public Item(String name, int price, int minLevel) {
        setName(name);
        setPrice(price);
        setMinLevel(minLevel);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}