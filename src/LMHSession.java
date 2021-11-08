import java.util.*;
import java.io.FileNotFoundException;

/*
* LMHSession - Contains methods for interacting with and updating at the game session level. startSession() function is where game logic lives.
*/
public class LMHSession {
    protected Utility utils;
    public ArrayList<Hero> chosenHeroesList = new ArrayList<Hero>();
    public World gameMap = new World();
    public static int heroXPos = 0;
    public static int heroYPos = 0;

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
        return heroXPos;
    }

    /*
    * Setter Method for x-position of Heroes
    */
    public void setXPos(int x) {
        heroXPos = x;
    }

    /*
    * Getter Method for y-position of Heroes
    */
    public int getYPos() {
        return heroYPos;
    }

    /*
    * Setter Method for y-position of Heroes
    */
    public void setYPos(int y) {
        heroYPos = y;
    }

    
    /*
    * Method to take user move on WASD keypad and move accordingly. Can also access Hero log and quit game as needed. Outputs move.
    */
    public String makeMove() {
        String move = utils.getString("Please enter the direction (w,a,s,d), 'log' to see Hero stats, or enter 'q' to quit game.");
        
        // Possible moves
        if (move.equals("A") || move.equals("a")) { // Move Left
            int curX = heroXPos;
            int curY = heroYPos;
            if (curY - 1 >= 0 && !this.gameMap.backgroundMap[curX][curY-1].equals("I")) {
                setYPos(curY-1);
            }
        } else if (move.equals("W") || move.equals("w")) { // Move Up
            int curX = heroXPos;
            int curY = heroYPos;
            if (curX - 1 >= 0 && !this.gameMap.backgroundMap[curX-1][curY].equals("I")) {
                setXPos(curX-1);
            }
        } else if (move.equals("D") || move.equals("d")) { // Move Right
            int curX = heroXPos;
            int curY = heroYPos;
            if (curY + 1 >= 0 && !this.gameMap.backgroundMap[curX][curY+1].equals("I")) {
                setYPos(curY+1);
            }
        } else if (move.equals("S") || move.equals("s")) { // Move Down
            int curX = heroXPos;
            int curY = heroYPos;
            if (curY + 1 >= 0 && !this.gameMap.backgroundMap[curX+1][curY].equals("I")) {
                setXPos(curX+1);
            }

        } else if (move.equals("log")) { // Check Hero skills Log
            System.out.println("Hero Log:");
            for (int r = 0; r < this.chosenHeroesList.size(); r++) {
                System.out.println(this.chosenHeroesList.get(r).toString());
            }

        } else if (move.equals("Q") || move.equals("q")) { // Player chose to quit game
            return move; // Return String move from user input to quit

        } else { // Player inputted incorrectly, prompt them to try again
            System.out.println("Incorrect Entry. Please enter the direction (w,a,s,d), or enter 'q' to quit game.");
        }

        // Return String move from user input
        return move;
    }


    /*
    * Method to return what is on the board space
    */
    public String returnSpace(int x, int y) {
        return this.gameMap.currentMap[x][y];
    }


    /*
    * Method to generate Hero list at beginning of game
    */
    public void createHeroesList(int numHeroes) throws FileNotFoundException {
        Utility utils = new Utility();

        // Parse txt files for possible Heroes for player to choose
        TxtParse parser = new TxtParse();
        List<Warrior> listWarrior = parser.parseWarrior();
        List<Sorcerer> listSorcerer = parser.parseSorcerer();
        List<Paladin> listPaladin = parser.parsePaladin();
        List<Hero> heroesList = new ArrayList<>();
        
        // Add Monster options to list
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

        // Player chooses Heroes
        int choice = 0;
        for (int j = 0; j < numHeroes; j++) {
            choice = utils.getInt("Type in number shown on the left of your choice and hit Enter:");
            if (choice < 1 || choice > heroesList.size()-1) {
                continue;
            } else { // If hero is selected properly, add hero to ArrayList object chosenHeroesList for gameplay use
                System.out.println("Great choice! You've chosen " + heroesList.get(choice-1).getName().toString() + ".");
                this.chosenHeroesList.add(heroesList.get(choice-1));
                System.out.println("");
            }
        }
        if (choice < 1 || choice > heroesList.size()-1 || chosenHeroesList.size() != numHeroes) {
            System.out.println("Incorrect Hero selection, please start over.");
            createHeroesList(numHeroes);
        } 
    }


    /*
    * Method to generate Monster List for fight
    */
    public ArrayList<Monster> monstersForFight(int heroNum) throws FileNotFoundException {

        // Parse txt files for possible Heroes for player to choose
        TxtParse parser = new TxtParse();
        List<Dragon> listDragon = parser.parseDragon();
        List<Exoskeleton> listExoskeleton = parser.parseExoskeleton();
        List<Spirit> listSpirit = parser.parseSpirit();
        ArrayList<Monster> monsterList = new ArrayList<Monster>();
        ArrayList<Monster> chosenMonsterList = new ArrayList<Monster>();

        // Add Monster options to list
        for (int i = 0; i < listDragon.size(); i++) {
            monsterList.add(i, listDragon.get(i));
        }
        for (int i = 0; i < listExoskeleton.size(); i++) {
            monsterList.add(i, listExoskeleton.get(i));
        }
        for (int i = 0; i < listSpirit.size(); i++) {
            monsterList.add(i, listSpirit.get(i));
        }

        // Random Monster selection, choose as many as there are Heroes in game
        Random r = new Random();
        for (int j = 0; j < heroNum; j++) {
            int rndPos = r.nextInt(monsterList.size());
            chosenMonsterList.add(monsterList.get(rndPos));
        }

        // return ArrayList<Monster> of randomly selected Monsters
        return chosenMonsterList;

    }


    /*
    * Method to run Legends: Heroes and Monsters game session
    */
    public void startSession() throws FileNotFoundException{
        // Introduce game
        System.out.println("Welcome to Legends: Monsters and Heroes!");
        System.out.println("It is time to start your Quest.");
        System.out.println("");
        System.out.println("How many heroes would you like to play with?");
        System.out.println("Choose number of heroes:");
        System.out.println("'1' - one hero");
        System.out.println("'2' - two heroes");
        System.out.println("'3' - three heroes");

        // Select number of Heroes for game
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

        // Create list of Heroes to use during game
        createHeroesList(heroNumber);

        // control will contain users most recent input during game
        String control = "";
        while (!control.equals("Q") && !control.equals("q")) {
            // Initialize game world
            World gameWorld = new World();
            gameWorld.setHeroSpace(heroXPos, heroYPos);
            gameWorld.printMap(8);

            // Make move
            control = makeMove();

            // If player chooses to quit
            if (control.equals("q") || control.equals("Q")) {
                break;
            }

            System.out.println("");
            System.out.println("Good move!");
            System.out.println("");
            // Retrieve content in game map space (market, common, or impassible space)
            String str = returnSpace(heroXPos,heroYPos);
            
                if (str.equals("M")) { // If space is a market
                    System.out.println("Would you like to enter the market?");
                    String inOrOut = utils.getString("Enter 'e' to go in. Enter any other character to pass.");
                    // Player enters market
                    if (inOrOut.equals("e") || inOrOut.equals("E")) {
                        Market market = new Market();
                        // Heroes shop for goods in Market
                        this.chosenHeroesList = market.shoppingTrip(this.chosenHeroesList);
                    }
                
                } else if (str.equals("C")) { // if space is a common space

                    // Check if monster is in space
                    boolean monster = gameWorld.isThereAMonster();
                    if (monster) {  // If true, fight monsters
                        ArrayList<Monster> monstersList = monstersForFight(heroNumber);
                        Fight fight = new Fight(this.chosenHeroesList, monstersList);
                        fight.doFight();
                    
                    } else {    // If false, go to next turn
                        continue;
                    }
                }
        }
        
        // Print goodbye message when player decides to quit game
        System.out.println("Thank you for playing. Looking forward to seeing you here next time!");
    }
}