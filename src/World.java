public class World {

    String[][] backgroundMap;

    public World() {
        this.backgroundMap = new String[][] 
                    {{"M","I","C","M","C","M","M","C"},
                    {"I","C","M","C","C","M","M","M"},
                    {"M","M","C","C","C","C","M","C"},
                    {"C","M","M","M","M","C","M","C"},
                    {"C","C","M","M","M","I","M","I"},
                    {"M","I","C","I","I","C","C","C"},
                    {"I","C","C","C","I","I","C","C"},
                    {"C","M","C","C","M","M","I","I"}};
    }

    public String getSpace(int r, int c) {
        return this.backgroundMap[r][c];
    }

     /* 
     * A method used to print the map of the World.
     */   

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
                System.out.print(this.backgroundMap[r][c] + " | ");
            }
            System.out.println();
        }
    
    }
}