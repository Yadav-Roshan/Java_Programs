// Purpose: Demonstrate user-defined exception.
// Importing scanner package
import java.util.Scanner;

// User-defined exception class
class NOMATCHEXCP extends Exception {
    // Constructor
    public NOMATCHEXCP(int line, String input) {
        // Calling super class constructor
        super("Error: Line " + line + ": \"" + input + "\" is not equal to \"India\"");
    }
}

// Main class
public class ExceptionDemo {
    // Main method
    public static void main(String[] args) {
        // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        // Declaring variables
        String input;
        // Line number
        int line = 0;

        // Try block
        try {
            // Prompting user for input
            System.out.print("Enter a string: ");
            // Reading input
            input = scanner.nextLine();
            // Incrementing line number
            line++;

            // Checking if input is equal to "India"
            if (!input.equals("India")) {
                // Throwing exception
                throw new NOMATCHEXCP(line, input);
            }
            
            // Printing input
            System.out.println("Input string is equal to \"India\"");
        
        // Catch block
        } catch (NOMATCHEXCP e) {
            // Printing exception message
            System.err.println(e.getMessage());
        }
    }
}
