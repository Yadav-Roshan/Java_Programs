//Importing Scanner class from java.util package for Scanning inputs
import java.util.Scanner;
//Importing every classes form java.io package for system input and output through data streams
import java.io.*;

//Only public class UserInput with all the methods we need to input numbers and arrays
public class UserInput{
    //Declaring arrays, numbers to store input from user
    double[] numbers = new double[2];

    //Scanner object to take inputs
    Scanner scan = new Scanner(System.in);

    //BufferedReader object to take input through system stream
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Method to take input character for the respective operations as shown in dashboard
    public char insertOperator(){
        System.out.println("Enter + for Addition: ");
        System.out.println("Enter - for Subtraction: ");
        System.out.println("Enter A for Array Addition: ");
        System.out.println("Enter v for Variance of Array: ");
        System.out.println("Enter s for Standard Deviation of an Array: ");
        
        //Scanning character
        char operator = scan.next().charAt(0);
        
        //returning scanned character
        return operator;
    }
    
    //Method to insert numbers for general arithmetic
    public double[] insertNumbers(){
        
        //Scanning First Number and storing in array numbers
        System.out.println("Enter First Number: ");
        numbers[0] = scan.nextDouble();
        
        //Scanning Second Number and storing in array numbers
        System.out.println("Enter Second Number: ");
        numbers[1] = scan.nextDouble();
        
        //returning array numbers
        return numbers;
    }
    
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
        
        for(int i=0; i<size_of_array; i++){
            numbers[i] = Double.parseDouble(array_numbers[i]);
        }
        
        //returning numbers array
        return numbers;
    }
}
