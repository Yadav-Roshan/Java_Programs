// Purpose: This program calculates the factorial of a number.
class MyExcep extends Exception {
  // Constructor
  public MyExcep(String message) {
    //  Calling super class constructor
    super(message);
  }
}

// Factorial class
public class Factorial {
  // Main method
  public static void main(String[] args) {
    //  Declaring variables
    int n;
    //  Looping through command line arguments
    for(int i=0;i<args.length;i++){
    //  Try block
    try {
      //  Declaring variables
      int fact = 1;
      //  Converting string to integer
      n = Integer.parseInt(args[i]);
      
      //  Checking if n is less than 0 or greater than 15
      if (n < 0 || n > 15) {
        //  Throwing exception
        throw new MyExcep("Invalid input! Integer must be between 0 and 15.");
      }

      //  Calculating factorial
      for (int j = 1; j <= n; j++) {
        //  Multiplying fact with j 
        fact *= j;
      }

      //  Printing factorial
      System.out.println("Factorial of " + n + " is: " + fact);
    
    //  Catch block  
    } catch (MyExcep e) {
      //  Printing exception message
      System.out.println(e.getMessage());
    //  Catch block
    } catch (NumberFormatException e) {
      //  Printing exception message
      System.out.println("Invalid input! Please enter an integer value.");
    }
  }
  }
}
