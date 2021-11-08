/*
* Wearable - Interface for items worn in the field of battle (Armor for this project).
*/
public interface Wearable {
    
    // Getter for damage reduced upon attack with wearable equipped
    public double getDamageReduc();

    // Setter for damage reduced upon attack with wearable equipped
    public void setDamageReduc(double dmgReduc);

}