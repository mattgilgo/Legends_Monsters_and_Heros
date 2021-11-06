import java.util.*;
import java.io.FileNotFoundException;

public class LMHSession {
    protected Utility utils;
    public ArrayList<Hero> chosenHeroesList;
    
    public LMHSession(){
        utils = new Utility();
    }

    public String makeMove() {
        String move = "";
        while (!move.equals("exit")) {
            move = utils.getString("");
            if (move.equals("w")) {
                // move up on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (move.equals("a")) {
                // move left on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (move.equals("s")) {
                // move down on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (move.equals("d")) {
                // move right on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (move.equals("exit")) {
                move = "exit";
            } else {
                System.out.println("Please enter the direction (w,a,s,d) you would like to go, or enter 'exit' to end game.");
            }
        } 
        return move;
    }

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
            this.chosenHeroesList.add(heroesList.get(choice-1));
            System.out.println("");
        }
    }

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

        // Initialize game world
        World gameWorld = new World();
        String control = "";
        
        while (!control.equals("Q") ||!control.equals("q")) {
            gameWorld.printMap(8);
            // Propose move change through Control class (if control class is needed)
            // Check Letter in cell
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