/*
* Main - Contains main method for running total program.
*/
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String args[]) throws FileNotFoundException{
        LMHSession session = new LMHSession();  // Create Legends: Monsters and Heroes session
        session.startSession();                 // Play Monsters and Heroes
    }

}
