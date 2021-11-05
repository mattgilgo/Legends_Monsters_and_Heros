public class World {

    String[][] map;

    public World() {
        this.map = new String[][] 
                    {{"H","I","C","M","C","M","M","C"},
                    {"I","C","M","C","C","M","M","M"},
                    {"M","M","C","C","C","C","M","C"},
                    {"C","M","M","M","M","C","M","C"},
                    {"C","C","M","M","M","I","M","I"},
                    {"M","I","C","I","I","C","C","C"},
                    {"I","C","C","C","I","I","C","C"},
                    {"C","M","C","C","M","M","I","I"}};
    }

    public String getSpace(int x, int y) {
        return this.map[x][y];
    }

}