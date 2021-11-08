/*
* Holdable - Interface for items held in the field of battle (Weapons for this project).
*/
public interface Holdable {

    // Getter method for open hands needed for Hero to use
    public int getReqHands();

    // Setter method for open hands needed for Hero to use weapon
    public void setReqHands(int hands);

}