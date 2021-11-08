import java.util.*;
import java.io.FileNotFoundException;

public class LMHSession {
    protected Utility utils;
    public ArrayList<Hero> chosenHeroesList = new ArrayList<Hero>();
    public int heroXPos = 0;
    public int heroYPos = 0;
    public World gameMap = new World();

    /*
    * Constructor Method for Legends: Heroes and Monsters game session
    */
    public LMHSession(){
        this.utils = new Utility();
    }

    /*
    * Getter Method for x-position of Heroes
    */
    public int getXPos() {
        return this.heroXPos;
    }

    /*
    * Setter Method for x-position of Heroes
    */
    public void setXPos(int x) {
        this.heroXPos = x;
    }

    /*
    * Getter Method for y-position of Heroes
    */
    public int getYPos() {
        return this.heroYPos;
    }

    /*
    * Setter Method for y-position of Heroes
    */
    public void setYPos(int y) {
        this.heroXPos = y;
    }

    /*
    * Method to return what is on the board space
    */
    public String returnSpace() {
        int x = getXPos();
        int y = getYPos();
        return this.gameMap.backgroundMap[x][y];
    }

    /*
    * Method to make a move on the game board
    */
    public String makeMove() {
        String move = utils.getString("");
        if (move.equals("W") || move.equals("w")) {
            int curX = getXPos();
            int curY = getYPos();
            if (curY - 1 >= 0 && !this.gameMap.backgroundMap[curX][curY-1].equals("I")) {
                setYPos(curY-1);
            }
        } else if (move.equals("A") || move.equals("a")) {
            int curX = getXPos();
            int curY = getYPos();
            if (curX - 1 >= 0 && !this.gameMap.backgroundMap[curX-1][curY].equals("I")) {
                setXPos(curX-1);
            }
        } else if (move.equals("S") || move.equals("s")) {
            int curX = getXPos();
            int curY = getYPos();
            if (curY + 1 >= 0 && !this.gameMap.backgroundMap[curX][curY+1].equals("I")) {
                setYPos(curY+1);
            }
        } else if (move.equals("D") || move.equals("d")) {
            int curX = getXPos();
            int curY = getYPos();
            if (curY + 1 >= 0 && !this.gameMap.backgroundMap[curX][curY+1].equals("I")) {
                setYPos(curY+1);
            }
        } else {
            System.out.println("Please enter the direction (w,a,s,d), or enter 'q' to quit game.");
        }
        return move;
    }

    /*
    * Method to generate Hero list at beginning of game
    */

    public void createHeroesList(int numHeroes) throws FileNotFoundException {
        Utility utils = new Utility();

        TxtParse parser = new TxtParse();
        List<Warrior> listWarrior = parser.parseWarrior();
        List<Sorcerer> listSorcerer = parser.parseSorcerer();
        List<Paladin> listPaladin = parser.parsePaladin();
        List<Hero> heroesList = new ArrayList<>();
        

        System.out.println("CHOOSE YOUR HERO (*smash narrator voice*)");
        System.out.println("");

        System.out.println("Warriors:");
        for (int i = 0; i < listWarrior.size(); i++) {
            System.out.println("'"+(i+1)+"'" + " = " + listWarrior.get(i).toString());
            heroesList.add(i, listWarrior.get(i));
        }
        System.out.println("");

        System.out.println("Sorcerers:");
        for (int i = 0; i < listSorcerer.size(); i++) {
            System.out.println("'"+(i+7)+"'" + " = " + listSorcerer.get(i).toString());
            heroesList.add(i, listSorcerer.get(i));
        }
        System.out.println("");

        System.out.println("Paladins:");
        for (int i = 0; i < listPaladin.size(); i++) {
            System.out.println("'"+(i+13)+"'" + " = " + listPaladin.get(i).toString());
            heroesList.add(i, listPaladin.get(i));
        }
        System.out.println("");

        System.out.println("^^^ Choose Hero from above. ^^^");

        for (int j = 0; j < numHeroes; j++) {
            int choice = utils.getInt("Type in number shown on the left of your choice and hit Enter:");
            System.out.println("Great choice! You've chosen " + heroesList.get(choice-1).getName().toString());
            System.out.println("Heroes list size: " + heroesList.size());
            this.chosenHeroesList.add(heroesList.get(choice-1));
            System.out.println("");
        }
    }

    /*
    * Method to generate Monster List for fight
    */
    public ArrayList<Monster> monstersForFight(int heroNum) throws FileNotFoundException {
        TxtParse parser = new TxtParse();
        List<Dragon> listDragon = parser.parseDragon();
        List<Exoskeleton> listExoskeleton = parser.parseExoskeleton();
        List<Spirit> listSpirit = parser.parseSpirit();
        ArrayList<Monster> monsterList = new ArrayList<Monster>();
        ArrayList<Monster> chosenMonsterList = new ArrayList<Monster>();

        for (int i = 0; i < listDragon.size(); i++) {
            monsterList.add(i, listDragon.get(i));
        }
        for (int i = 0; i < listExoskeleton.size(); i++) {
            monsterList.add(i, listExoskeleton.get(i));
        }
        for (int i = 0; i < listSpirit.size(); i++) {
            monsterList.add(i, listSpirit.get(i));
            //System.out.println("'"+(i+10)+"'" + " = " + listSpirit.get(i).toString());
        }

        Random r = new Random();
        for (int j = 0; j < heroNum; j++) {
            int rndPos = r.nextInt(monsterList.size());
            chosenMonsterList.add(monsterList.get(rndPos));
        }

        return chosenMonsterList;

    }




    /*
    * Method to run Legends: Heroes and Monsters game session
    */
    public void startSession() throws FileNotFoundException{
        System.out.println("Welcome to Legends: Monsters and Heroes!");
        System.out.println("It is time to start your Quest.");
        System.out.println("");
        System.out.println("How many heroes would you like to play with?");
        System.out.println("Choose number of heroes:");
        System.out.println("'1' - one hero");
        System.out.println("'2' - two heroes");
        System.out.println("'3' - three heroes");
        String heroNumSelection = utils.getString("");
        int heroNumber = 0;

        try {
            heroNumber = Integer.parseInt(heroNumSelection);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a '1','2', or '3' to select number of Heroes. Resetting game.");
            startSession();
        }

        if (heroNumber > 3 || heroNumber < 1) {
            System.out.println("Please enter a '1','2', or '3' to select number of Heroes. Resetting game.");
            startSession();
        }
        createHeroesList(heroNumber);

        String control = "";
        while (!control.equals("Q") && !control.equals("q")) {
            // Initialize game world
            World gameWorld = new World();
            gameWorld.printMap(8);
            String s = this.gameMap.backgroundMap[getXPos()][getYPos()];
            
            control = makeMove();
            String str = returnSpace();
                if (str.equals("M")) {
                    System.out.println("Would you like to enter the market?");
                    String inOrOut = utils.getString("Enter 'e' to go in. Enter any other character to pass.");
                    if (inOrOut.equals("e") || inOrOut.equals("E")) {
                        Market market = new Market();
                        this.chosenHeroesList = market.shoppingTrip(this.chosenHeroesList);
                    }
                } else if (str.equals("C")) {
                    boolean monster = gameWorld.isThereAMonster();
                    if (monster) {
                        ArrayList<Monster> monstersList = monstersForFight(heroNumber);
                        Fight fight = new Fight(this.chosenHeroesList, monstersList);
                        fight.doFight();
                    } else {
                        continue;
                    }
                }
                // If impassible "I" in cell
                    // print that you cant move there and let cycle through
                // If Market "M" in cell
                    // update spot on map
                    // enter market and execute buying/selling/etc
                // If Common Cell "C"
                    // update spot on map
                    // roll dice to see if there is a Monster there
                    // if yes
                        // execute fight function
                    // if no
                        // let cycle through 
        }

        System.out.println("Thank you for playing. Looking forward to seeing you here next time!");
    }
}