public class LMHSession {
    protected Utility utils;
    
    public LMHSession(){
        utils = new Utility();
    }

    public void startSession(){
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
        Hero heroOne = null;
        Hero heroTwo = null;
        Hero heroThree = null;

        try {
            heroNumber = Integer.parseInt(heroNumSelection);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a '1','2', or '3' to select number of Heroes.");
            startSession();
        }

        if (heroNumber == 1) {
            // Create one Hero
            heroOne = new Hero();

        } else if (heroNumber == 2) {
            // Create two Heroes
            heroOne = new Hero();
            heroTwo = new Hero();
 
        } else if (heroNumber == 3) {
            // Create three Heroes
            heroOne = new Hero();
            heroTwo = new Hero();
            heroThree = new Hero();
        }
         else if (heroNumber < 0 | heroNumber > 2) {
            // Ask users again how many characters they want to start with
            System.out.println("Please enter a 0, 1, or 2 to select an option.");
            startSession();
        }

        // Initialize game world
        World gameWorld = new World();

        String control = "";
        while (!control.equals("exit")) {
            control = utils.getString("");
            if (control.equals("w")) {
                // move up on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (control.equals("a")) {
                // move left on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (control.equals("s")) {
                // move down on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (control.equals("d")) {
                // move right on gameWorld grid
                // check board for whats at location to determine next step
                // check if game is over due to players fainting???
            } else if (control.equals("exit")) {
                control = "exit";
            } else {
                System.out.println("Please enter the direction (w,a,s,d) you would like to go, or enter 'exit' to end game.");
            }
        }

        System.out.println("Thank you for playing. Looking forward to seeing you here next time!");
    }

}