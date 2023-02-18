//Only public class Calculator for performing given operations in dashboard
public class Calculator{

    //Method to calculate addition of given numbers
    public double[] performAddition(double[] numbers){

        //Declaring result array to store sum
        double[] result = new double[2];

        //Calculation
        result[0] = numbers[0] + numbers[1];
        
        //returning result array with sum store at index 0
        return result;
    }
    
    //Method to perform subtraction of two numbers
    public double[] performSubtraction(double[] numbers){

        //Declaring result array to store difference
        double[] result = new double[2];

        //Calculation
        result[0] = numbers[0] - numbers[1];
        
        //Returning result array with difference stored at index 0
        return result;
    }
    
    //Method to perform Multiplication on given two numbers
    public double[] performMultiplication(double[] numbers){
        
        // Declaring result array to store product
        double[] result = new double[2];

        //Calculation
        result[0] = numbers[0] * numbers[1];
        
        //Returning result array with result at index 0
        return result;
    }

    //Method to perform Division on given two numbers
    public double[] performDivision(double[] numbers){

        // Declaring result array to store product
        double[] result = new double[2];
        
        //Calculation
        result[0] = numbers[0]/numbers[1];
        
        //Returning result array with result at index 0
        return result;
    }

    //Method to perform Addiiton on given array of numbers
    public double[] performArrayAddition(double[] numbers){

        // Declaring result array to store Sum
        double[] result = new double[4];

        //Variable to store intermediate sum
        double sum = 0;
        
        //Loop to add each elements of array numbers
        for(int i =0; i<numbers.length; i++){
            sum+= numbers[i];
        }
        
        //Storing sum in result array
        result[0] = sum;
        
        //Returning result array with result at index 0
        return result;
    }

    //Method to find Variance of given array of numbers
    public double[] performArrayVariance(double[] numbers){

        // Declaring result array to store variance
        double[] result = new double[4];

        //Variable to store intermediate sum
        double sum = 0;

        //Variable to store intermediate sum of differnce of mean and each numbers in array
        double sumdiff=0;
        
        //Loop to add each elements of array numbers
        for(int i =0; i<numbers.length; i++){
            sum+= numbers[i];
        }

        //Calculating mean
        double mean = (double)sum/(double)numbers.length;
        
        //Loop to add each difference of mean and numbers of array
        for(int j=0; j<numbers.length; j++){
            sumdiff += (double)Math.pow(mean - numbers[j], 2);
        }

        //Calculating Variance
        double variance = (double)sumdiff/(double)numbers.length;

        //Storing variance in result array
        result[0] = variance;

        //Returnin result array
        return result;
    }

    //Method to find Variance of given array of numbers
    public double[] performArrayStd(double[] numbers){

        // Declaring result array to store variance
        double[] result = new double[4];

        //Variable to store intermediate sum
        double sum = 0;

        double mean;
        double sumdiff=0;
        double variance;
        double std;
        
        //Loop to sum each elements of array
        for(int i =0; i<numbers.length; i++){
            sum+= numbers[i];
        }

        //Calculating mean
        mean = (double)sum/(double)numbers.length;
        
        //Loop to sum difference of mean and each numbers in array
        for(int j=0; j<numbers.length; j++){
            sumdiff += (double)Math.pow(mean - numbers[j], 2);
        }

        //Calculating variance
        variance = (double)sumdiff/(double)numbers.length;

        //Calculating standard deviation
        std = Math.sqrt(variance);

        //Storing standard deviation in result array at index 0
        result[0] = std;

        //Returnin result array with std deviation at index 0
        return result;
    }
}
