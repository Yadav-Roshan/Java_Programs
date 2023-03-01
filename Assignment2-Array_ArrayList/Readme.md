This is the directory for Assignment 2: Array_and_ArrayList It contains three files:

Main.java
InputUser.java
Operations.java

Operations.java contains Operations class with following three methods:

even_odd(): This is the method used to classify given input nubmers into two ArrayList even and odd and later display both.
closeNeighbors(): This is the method which returns the index of first number of the pair which has least difference in an array.
arrayToArrayList(): This is the method used to convert a given Array into ArrayList.

InputUser.java contains InputUser class with following three methods:

insertChoice(): This is a method used to take input the character as mentioned in menu for specific operations.
takeInput(): This is a method used to input number and return that number.
insertArray(): This is a method used to input an array of numbers where the size of the array is greater than 2.

Main.java contains Main class with following methods:

It contains switch case where user is allowed to enter a character for particular operations.
It contains main method inside which there's switch case for menu to select operations among Even Odd classification, Close Neighbors Determination and Array to ArrayList conversion.
Main method catches the returned values from different methods of Operations class and display them.
