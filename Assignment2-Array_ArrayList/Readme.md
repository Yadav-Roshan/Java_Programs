This is the directory for Assignment 2: Array_and_ArrayList It contains three files:

1. Main.java
2. InputUser.java
3. Operations.java

Operations.java contains Operations class with following three methods:

1. even_odd(): This is the method used to classify given input nubmers into two ArrayList even and odd and later display both.
2. closeNeighbors(): This is the method which returns the index of first number of the pair which has least difference in an array.
3. arrayToArrayList(): This is the method used to convert a given Array into ArrayList.

InputUser.java contains InputUser class with following three methods:

1. insertChoice(): This is a method used to take input the character as mentioned in menu for specific operations.
2. takeInput(): This is a method used to input number and return that number.
3. insertArray(): This is a method used to input an array of numbers where the size of the array is greater than 2.

Main.java contains Main class with following methods:

1. It contains switch case where user is allowed to enter a character for particular operations.
2. It contains main method inside which there's switch case for menu to select operations among Even Odd classification, Close Neighbors Determination and Array to ArrayList conversion.
3. Main method catches the returned values from different methods of Operations class and display them.
