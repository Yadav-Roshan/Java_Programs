/**
 * @author Roshan Kumar Yadav
 */
/*
 * Name: Roshan Kumar Yadav
 * PRN: 21070126130
 * Batch: AIML B3 (21-25)
 */

//Importing every IOException form java.io package to counter IOException when operating with arrays
import java.io.IOException;

//Only public Main Class
public class Main{
    //Main method
    public static void main(String[] args) throws IOException {
        //Making instance of class Operations
        Operations op = new Operations();

        //Making instance of class InputUser
        InputUser input = new InputUser();

        //Taking input from the given options for each operation in dashboard. Only character is allowed as mentioned in dashboard
        char choice = input.insertChoice();

        //Switch case
        switch(choice){

            //For classification of input numbers in even and odd arrays
            case 'a':

                //Calling method for above operation from Object op of class Operations
                op.even_odd();

                //Break to get out of the switch case
                break;

            //For selecting the index of first number which has least difference from its next number in an array
            case 'b':
                //Getting that index by calling closeNeighbors() method of class Operations through object op
                int idx = op.closeNeighbors();

                //Displaying the index
                System.out.println("Required index is: " + idx);

                //Break to get out of the switch case
                break;

            //To convert a given array into an arraylist
            case 'c':

                //Calling method arrayToArrayList() from class Operations through object op
                op.arrayToArrayList();

                //Break to get out of the switch case
                break;
        }
    }
}