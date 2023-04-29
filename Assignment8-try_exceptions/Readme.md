1. The ExceptionDemo class extends the Exception class and has a constructor that takes a String message parameter. This class is used to create custom exceptions with a specific error message.

2. The Factorial class has a main method that takes command-line arguments. It starts by looping through the command-line arguments, parsing each argument into an integer value. It then checks if the integer is between 0 and 15, and if not, throws a MyExcep exception with an error message.

If the integer is within the valid range, the code computes its factorial by using a loop to multiply all integers from 1 up to the given integer. The result is then printed to the console.

If an exception is caught, the appropriate error message is printed to the console. If a MyExcep exception is caught, the message of the exception is printed. If a NumberFormatException is caught, a message asking for an integer input is printed.
