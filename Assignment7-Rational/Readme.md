This directory contains java file of taking input two rational numbers:
It has following methods
1. public Rational(int numerator, int denominator): a constructor for the Rational class that takes two integers as arguments, representing the numerator and denominator of the rational number. It throws an exception if the denominator is zero, and reduces the fraction to its simplest form.

2. public Rational add(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the sum of the two numbers.

3. public Rational subtract(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the difference between the two numbers.

4. public Rational multiply(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the product of the two numbers.

5. public Rational divide(Rational other): a method that takes another Rational object as an argument and returns a new Rational object representing the quotient of the two numbers. It throws an exception if the other Rational's numerator is zero.

6. public double toDouble(): a method that returns the floating-point value of the rational number.

7. public Rational abs(): a method that returns a new Rational object representing the absolute value of the rational number.

8. public int compareTo(Rational other): a method that takes another Rational object as an argument and returns an integer value indicating whether the current object is less than, greater than, or equal to the other object.

9. private int gcd(int a, int b): a private helper method that calculates the greatest common divisor of two integers.

10. public String toString(): a method that overrides the default toString() method to return a string representation of the rational number in the form "numerator/denominator".

11. public static void main(String[] args): the main method of the program, which creates two Rational objects based on command-line arguments, performs various operations on them, and prints the results. It also handles exceptions related to invalid input and division by zero.
