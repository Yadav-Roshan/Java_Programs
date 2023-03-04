//Importing every IOException form java.io package to counter IOException when operating with arrays
import java.io.IOException;

//Importing every classes from java.util package which also includes Scanner
import java.util.*;

//Importing Scanner class from java.util package for Scanning inputs
import java.util.Scanner;

//Class Operations which contain methods for all required operations
public class Operations {
    //Declaring arrays, numbers to store input from user
    static double[] numbers;

    //Making instance of class InputUser
    InputUser input = new InputUser();

    //Method to classify given numbers as even or odd and store in respective arrays
    public void even_odd()
    {
        //ArrayList for Even Numbers
        ArrayList<Integer> Even = new ArrayList<Integer>();

        //ArrayList for odd numbers
        ArrayList<Integer> Odd = new ArrayList<Integer>();

        //Variable choice for taking input as choice to input more numbers
        String choice;

        //Do while loop to take numbers as input from users
        do{
            //Object of Scanner class to take numbers as input
            Scanner scan = new Scanner(System.in);

            //Variable num which will store input number
            int num = input.takeInput();

            //Logical block to check whether the number is even or odd and then storing in respective arrayList
            if(num%2 == 0){
                //For Even
                Even.add(num);
            }
            else{
                //For odd
                Odd.add(num);
            }

            //Asking user if he/she wants to add more numbers
            System.out.print("Do you want to add more? (Y/N): ");

            //Storing the choice in variable choice
            choice = scan.nextLine();

        }while(choice.equals("Y") || choice.equals("y")); //While condition for do while loop

        //Printing even ArrayList
        System.out.println("Even: " + Even);

        //Printing Odd ArrayList
        System.out.println("Odd " + Odd);
    }

    //Method for choosing index of first number whose difference from next number is the least in Array
    public int closeNeighbors() throws IOException { //Avoiding IOException while operating on Arrays

        // Declaring variable bestIdx with initialized value zero, it will store the index of first number of the pair
            int bestIdx = 0;

            //Taking array input
            numbers = input.insertArray();

            //Variable for storing Least Difference
            double bestDiff = Math.abs(numbers[0]-numbers[1]);

            //For loop to find Least Difference
            for (int i = 1; i < numbers.length - 1; i++) {

                //diff is variable to store difference between number at ith index and (i+1)th index
                double diff = Math.abs(numbers[i] - numbers[i + 1]);

                //Logical block to decide the least difference and assigning the best index
                if (diff < bestDiff) {
                    bestDiff = diff;
                    bestIdx = i;
                }
            }
        //Function returning the required index of number in array
        return bestIdx;
    }

    //Method to convert an Array into ArrayList
    public void arrayToArrayList() throws IOException{

        //Taking array as input by calling insertArray() method from class InputUser
        numbers = input.insertArray();

        //Using instance operator checking if the given object is array or not of type double
        System.out.print("Using instanceof operator result for Array is: ");
        System.out.println(numbers instanceof double[]);

        //Printing Array
        System.out.print("Array: ");

        //Loop to print array
        for(double a: numbers){
            System.out.print(a + ", ");
        }
        System.out.println();

        //Declaring an ArrayList lstNumbers which will store every elements of the given array
        ArrayList<Double> lstNumbers = new ArrayList<Double>();

        //Storing elements of array in ArrayList
        for(double a:numbers){
            lstNumbers.add(a);
        }

        //Printing ArrayList
        System.out.println("ArrayList is : " + lstNumbers);
    }
}
