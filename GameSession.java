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

        try {
            heroNumber = Integer.parseInt(heroNumSelection);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a '1','2', or '3' to select number of Heroes.");
            startSession();
        }

        if (gameNumber == 1) {
            // Start Black Jack game 
            BlackJack BJgame = new BlackJack();
            BJgame.playGame();

        } else if (gameNumber == 2) {
            // Start Trianta Ena
            TriantaEna TEgame = new TriantaEna();
            TEgame.playGame();
 
        } else if (gameNumber < 0 | gameNumber > 2) {
            System.out.println("Please enter a 0, 1, or 2 to select an option.");
            startSession();
        }


    }

}