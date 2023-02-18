/**
 * @author Roshan Kumar Yadav
 */
/*
 * Name: Roshan Kumar Yadav
 * PRN: 21070126130
 * Batch: AIML B3 (21-25)
*/

//Importing Scanner class in java.util package to read input from prompt
import java.util.Scanner;

//Only public Main Class
public class Main{

	//Declaring arrays, numbers to store input from user and result to display result stored after calculation
	static double[] numbers;
	static double[] result;
	
	//Main method
	public static void main(String[] args){

		//Making instance of class UserInput
		UserInput input = new UserInput();

		//Making instance of class Calculator
		Calculator calculator = new Calculator();

		//Declaring variable ans to support do-while loop
		int ans;
		
		//Do- while loop to iterate dashboard
		do{
			//Taking input from the given options for each operation in dashboard. Only character is allowed as mentioned in dashboard
			char operator = input.insertOperator();

			//Switch case
			switch(operator){

				//For addition of two numbers
				case '+':
					//Inputting numbers
					numbers = input.insertNumbers();
					System.out.println("First Number is:" + numbers[0]);
					System.out.println("Second Number is:" + numbers[1]);
					
					//Performing Addition using methods of instance calculator
					result = calculator.performAddition(numbers);
					System.out.println("Sum is:" + result[0]);
					
					//Break to get out of the switch case
					break;
					
				case '-':
					numbers = input.insertNumbers();
					System.out.println("First Number is:" + numbers[0]);
					System.out.println("Second Number is:" + numbers[1]);
					
					//Performing Subtraction using methods of instance calculator
					result = calculator.performSubtraction(numbers);
					System.out.println("Difference is:" + result[0]);

					//Break to get out of the switch case
					break;
					
				case 'A':

					//Try-Catch block in case of Exceptions for Array operations
					try{

						//Taking array input
						numbers = input.insertArray();
						
						//Calculating sum of elements of array using methods of instance calculator
						result  = calculator.performArrayAddition(numbers);
						System.out.println("Addition of Array is: "+ result[0]);
					}
					catch (Exception e) {
						//Printing Exception in case it occurs
						e.printStackTrace();
					}
					//Break to get out of the switch case
					break;
				
				case 'v':
				//Try-Catch block in case of Exceptions for Array operations
					try{
						//Taking array input
						numbers = input.insertArray();
						
						//Calculating variance of elements of array using methods of instance calculator
						result  = calculator.performArrayVariance(numbers);
						System.out.println("variance of Array is: "+ result[0]);
					}
					catch (Exception e) {
						//Printing Exception in case it occurs
						e.printStackTrace();
					}
					//Break to get out of the switch case
					break;

				case 's':
				//Try-Catch block in case of Exceptions for Array operations
					try{
						//Taking array input
						numbers = input.insertArray();
						
						//Calculating standard deviation of elements of array using methods of instance calculator
						result  = calculator.performArrayStd(numbers);

						//Printing result
						System.out.println("Standard Deviation of Array is: "+ result[0]);
					}
					catch (Exception e) {
						//Printing Exception in case it occurs
						e.printStackTrace();
					}
					//Break to get out of the switch case
					break;
			}

			//Scanner object to scan yes or no from user for do while loop
			Scanner sc = new Scanner(System.in);
			System.out.print("Do you want to continue?(Y=1|N=0): ");

			//Storing answer in variable ans
			ans = sc.nextInt();

		}while(ans == 1); //while condition for loop
		
	}
}