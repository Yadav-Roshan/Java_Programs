This is the folder for Assignment 1: Calculator
It contains three files:
1. Main.java
2. UserInput.java
3. Calculator.java

Calculator.java contains seven functions:
1. performAddition(): This is the function used to add two nubmers and return the result.
2. performSubtraction(): This is the function used to subtract two numbers and return the result.
3. performMultiplication(): This is the funciton used to multiply two numbers and return the result.
4. performDivision(): This is the function used to divide two numbers andreturn the result.
5. performArrayAddition(): This is the function used to add numbers presesnt in an array where array size is greater than 2.
6. performArrayVariance(): This is the function used to get the variance of the numbers present in an array where size of the array is greater than 2.
7. performArrayStd(): This is the function used to get the standard deviation of the numbers present in an arrat where size of the array is greater than 2.

UserInput.java contains two functions:
1. insertOperator(): This is a function used to take input the character as mentioned in menu for specific operations.
2. insertNumbers(): This is a function used to input two numbers and return the two numbers in an array form.
3. insertArray(): This is a function used to input an array of numbers where the size of the array is greater than 2.

Main.java does the following funcitons:
1. It contains switch case where user is allowed to enter a character for particular operations.
2. Sees whether the user needs to input two numbers or more.
3. If two numbers, then does inputTwoNumbers() and lets the user choose any of the addNum(), subtractNum(), multiplyNum(), divideNum() functions.
4. If more than two numbers, then does inputMultipleNumbers() and lets the user choos any of the addArr(), varArr(), stdArr() functions.
