import java.util.*;

/*
* World - Contains methods to initialize game board and store information about the board for use during session.
*/
public class World {

    String[][] backgroundMap;
    String[][] currentMap;

    // Constructor method for the game map.
    public World() {
        this.backgroundMap = new String[][] 
                    {{"M","I","C","M","C","M","M","C"},
                    {"C","C","M","C","C","M","M","M"},
                    {"I","M","C","C","C","C","M","C"},
                    {"C","M","M","M","M","C","M","C"},
                    {"C","C","M","M","M","I","M","I"},
                    {"M","I","C","I","I","C","C","C"},
                    {"I","C","C","C","I","I","C","C"},
                    {"C","M","C","C","M","M","I","I"}};
        this.currentMap = new String[][] 
                    {{"M","I","C","M","C","M","M","C"},
                    {"C","C","M","C","C","M","M","M"},
                    {"I","M","C","C","C","C","M","C"},
                    {"C","M","M","M","M","C","M","C"},
                    {"C","C","M","M","M","I","M","I"},
                    {"M","I","C","I","I","C","C","C"},
                    {"I","C","C","C","I","I","C","C"},
                    {"C","M","C","C","M","M","I","I"}};
    }

    // Getter method for what exists in the game map (market, monster, impassible).
    public String getSpace(int r, int c) {
        return this.backgroundMap[r][c];
    }

    // Setter method to show where hero is on printed map.
    public void setHeroSpace(int r, int c) {
        this.currentMap[r][c] = "H";
    }

    // Method to check if a monster exists in a Common space.
    public boolean isThereAMonster() {
        Random r = new Random();
        int ran = r.nextInt(100);
        boolean check = ran < 50;
        if (check) {
            return true;
        } else {
            return false;
        }
    }

      
    // Method used to print the map of the World.   
    public void printMap(int n) {
        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            int j = i+1;
            System.out.print("   " + j);
        }
        System.out.println("");
        for (int r = 0; r < n; r++) {
            System.out.print(r+1 + " | ");
            for (int c = 0; c < n; c++) {
                System.out.print(this.currentMap[r][c] + " | ");
            }
            System.out.println();
        }
    
    }
}