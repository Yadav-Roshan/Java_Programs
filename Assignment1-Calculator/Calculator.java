import java.lang.Math;

public class Calculator{
	static double[] result = new double[1];
	// This is the function for adding two numbers
	public double[] addNum(double[] numbers){
		result[0] = numbers[0] + numbers[1];
		return result;
	}
	//This is the function for subtracting two numbers
	public double[] subtractNum(double[] numbers){
		result[0] = numbers[0] - numbers[1];
		return result;
	}
	//This is the fucntion for multiplying two numbers
	public double[] multiplyNum(double[] numbers){
		result[0] = numbers[0] * numbers[1];
		return result;
	}
	//This is the function for dividing two numbers
	public double[] divideNum(double[] numbers){
		result[0] = numbers[0] / numbers[1];
		return result;
	}
	//This is the function for adding numbers in an array
	public double[] addArr(double[] numbers){
		for(int i=0;i<numbers.length;i++){
			result[0] += numbers[i];
		}
		return result;
	}
	//This is th function for finding varaince of the numbers in the array
	public double[] varArr(double[] numbers){
		double mean = addArr(numbers)[0]/numbers.length;
		double var = 0;
		//Summation of (x-x(mean))
		for(int i=0;i<numbers.length;i++){
			var += Math.pow(numbers[i]-mean,2);
		}
		result[0] = var/numbers.length;
		return result;
	}
	//This is the function for finding standard deviation of the numbers in the array
	public double[] stdArr(double[] numbers){
		//Standard Deviation = 	√(Variance)
		result[0] = Math.pow(varArr(numbers)[0],0.5);
		return result;
	}
}
