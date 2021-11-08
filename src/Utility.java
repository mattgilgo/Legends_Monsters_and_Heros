import java.util.*;

/*
* Utility - class to handle error checking for user inputs.
*/
public class Utility {
    Scanner scan;

    // Constructor method for Utility
    public Utility(){
        scan = new Scanner(System.in);
    }

    // Method for user input of a string
    public String getString(String prompt){
        System.out.println(prompt);
        return scan.nextLine();
    }

    // Method for user input of a double
    public double getDouble(String prompt) {
        System.out.println(prompt);
        try {
            return Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value");
            return getDouble(prompt);
        }
        
    }

    // Method for user input of a integer
    public int getInt(String prompt){
        System.out.println(prompt);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value");
            return getInt(prompt);
        }
    }

    // Method for user input of a boolean
    public boolean getYesNo(String prompt) {
        System.out.println(prompt);
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return true;
        } else if (response.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("Please enter either 'Yes' or 'No'. ");
            return getYesNo(prompt);
        }
    }
}