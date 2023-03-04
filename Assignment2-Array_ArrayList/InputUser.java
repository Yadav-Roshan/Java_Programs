//Importing every classes form java.io package for system input and output through data streams
import java.io.*;

//Importing Scanner class from java.util package for Scanning inputs
import java.util.Scanner;

//InputUser class which contains methods to take input various for various variables
public class InputUser {
    //Scanner object to take inputs
    Scanner scan = new Scanner(System.in);

    //BufferedReader object to take input through system stream
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Method to take array as an input
    public double[] insertArray() throws IOException { //Taking care of IOException

        //Input for size of array
        System.out.println("Enter Total Numbers: ");
        int size_of_array = scan.nextInt();

        //Input for numbers in array
        System.out.println("Enter " + size_of_array + " Numbers: ");
        //Declaring array of given size
        double[] numbers = new double[size_of_array];

        //Input for numbers in array as string
        String array = br.readLine();

        //Trimming input string to extract numbers
        String[] array_numbers = array.trim().split("\\s+");

        //For loop to parse each number as type Double
        for(int i=0; i<size_of_array; i++){
            numbers[i] = Double.parseDouble(array_numbers[i]);
        }

        //returning numbers array
        return numbers;
    }

    //Taking number as input
    public int takeInput(){

        //Scanner Object to take input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");

        //Scanning number from prompt
        int num = scan.nextInt();

        //Returning the input number
        return num;
    }

    //Method to take choice for dashboard as input
    public char insertChoice(){

        //Displaying Dashboard
        System.out.println("a. Even Odd Arrays");
        System.out.println("b. Neighboring Numbers with Least Difference");
        System.out.println("c. Array 2 ArrayList");
        System.out.print("Enter Choice: ");

        //Scanning choice from prompt
        char choice = scan.next().charAt(0);

        //Returning choice
        return choice;
    }
}