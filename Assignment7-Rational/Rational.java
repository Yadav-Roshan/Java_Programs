// Purpose: Class definition for Rational class
public class Rational {
    // Instance variables
    private int numerator;
    // Denominator cannot be zero
    private int denominator;

    // Default constructor
    public Rational(int numerator, int denominator) {
        // If denominator is zero, throw an exception
        if (denominator == 0) {
            // Throw an exception
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        // If numerator is zero, set denominator to 1
        if (numerator == 0) {
            // Set denominator to 1
            this.numerator = 0;
            // Set denominator to 1
            this.denominator = 1;
        } else {
            // If denominator is negative, make numerator negative
            int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;

            // If denominator is negative, make numerator negative
            if (this.denominator < 0) {
                this.numerator *= -1;
                this.denominator *= -1;
            }
        }
    }

    // Add methods
    public Rational add(Rational other) {
        // a/b + c/d = (ad + bc)/bd
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        // a/b + c/d = (ad + bc)/bd
        int newDenominator = this.denominator * other.denominator;
        // Return the result
        return new Rational(newNumerator, newDenominator);
    }

    // Subtract methods
    public Rational subtract(Rational other) {
        // a/b - c/d = (ad - bc)/bd
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        // a/b - c/d = (ad - bc)/bd
        int newDenominator = this.denominator * other.denominator;
        // Return the result
        return new Rational(newNumerator, newDenominator);
    }

    // Multiply methods
    public Rational multiply(Rational other) {
        // a/b * c/d = ac/bd
        int newNumerator = this.numerator * other.numerator;
        //  a/b * c/d = ac/bd
        int newDenominator = this.denominator * other.denominator;
        // Return the result
        return new Rational(newNumerator, newDenominator);
    }

    // Divide methods
    public Rational divide(Rational other) {
        // a/b / c/d = ad/bc
        if (other.numerator == 0) {
            // Throw an exception
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        // a/b / c/d = ad/bc
        int newNumerator = this.numerator * other.denominator;
        // a/b / c/d = ad/bc
        int newDenominator = this.denominator * other.numerator;
        // Return the result
        return new Rational(newNumerator, newDenominator);
    }

    // Convert to double
    public double toDouble() {
        // Return the result
        return (double) this.numerator / this.denominator;
    }

    // Absolute value
    public Rational abs() {
        // Return the result
        return new Rational(Math.abs(this.numerator), this.denominator);
    }

    // Compare two rational numbers
    public int compareTo(Rational other) {
        // a/b < c/d if ad < bc
        int thisNumerator = this.numerator * other.denominator;

        // a/b < c/d if ad < bc
        int otherNumerator = other.numerator * this.denominator;

        // Return the result
        return Integer.compare(thisNumerator, otherNumerator);
    }

    // Greatest common divisor
    private int gcd(int a, int b) {
        // Return the result
        return b == 0 ? a : gcd(b, a % b);
    }

    // Override toString method
    @Override
    public String toString() {
        // Return the result
        return numerator + "/" + denominator;
    }

    // Main method
    public static void main(String[] args) {
        // Try to execute the following code
        try {
            // If argument is not number throw an exception
            int numerator1 = Integer.parseInt(args[0]);
            // If argument is not number throw an exception
            int denominator1 = Integer.parseInt(args[1]);
            //  If argument is not number throw an exception
            int numerator2 = Integer.parseInt(args[2]);
            // If argument is not number throw an exception
            int denominator2 = Integer.parseInt(args[3]);

            // Create two rational numbers
            Rational rational1 = new Rational(numerator1, denominator1);
            Rational rational2 = new Rational(numerator2, denominator2);

            // Print the results
            System.out.println("Rational Number 1: " + rational1);
            System.out.println("Rational Number 2: " + rational2);

            // Print the results
            // Print the result of addition
            System.out.println("Sum: " + rational1.add(rational2));
            // Print the result of subtraction
            System.out.println("Difference: " + rational1.subtract(rational2));
            // Print the result of multiplication
            System.out.println("Product: " + rational1.multiply(rational2));
            // Print the result of division
            System.out.println("Quotient: " + rational1.divide(rational2));
            // Print the result of converting to double
            System.out.println("Floating point value of Rational Number 1: " + rational1.toDouble());
            // Print the result of converting to double
            System.out.println("Floating point value of Rational Number 2: " + rational2.toDouble());

            // Print the results
            System.out.println("Absolute value of Rational Number 1: " + rational1.abs());
            System.out.println("Absolute value of Rational Number 2: " + rational2.abs());

            // Compare two rational numbers
            int result = rational1.compareTo(rational2);
            if (result < 0) {
                System.out.println(rational1 + " is less than " + rational2);
            } else if (result > 0) {
                System.out.println(rational1 + " is greater than " + rational2);
            } else {
                System.out.println(rational1 + " is equal to " + rational2);
            }
            // Catch the exception
        } catch (NumberFormatException e) {
            // Print the message
            System.out.println("Invalid input. Please enter integers only.");
            // Catch the exception
        } catch (IllegalArgumentException e) {
            // Print the message
            System.out.println(e.getMessage());
        }
    }
}