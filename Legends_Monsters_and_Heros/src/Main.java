/*
* Main - Contains main method for running total program.
*/
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String args[]) throws FileNotFoundException{
        LMHSession session = new LMHSession();
        session.startSession();
    }

}
