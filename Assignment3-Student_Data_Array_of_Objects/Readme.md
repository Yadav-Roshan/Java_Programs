This is the directory for Assignment 3:-Student_Data_Array_of_Objects
It contains three files:

1. Main.java
2. Student.java
3. Operations.java

Operations.java contains Operations class with following three methods:

1. addStudent(): This is the method used to add student details in Student object which instead will be stored in an array.
2. displayStudents(): This is the method which display all the Student object stored in an array.
3. searchByPrn(): This is the method used to search student by their PRN from the array in which Student objects are stored.
4. searchByName(): This is the method used to search student by their Name from the array in which Student objects are stored.
5. searchByIndex(): This is the method used to search student by the index from the array in which Student objects are stored.
6. edit(): This is the method used to edit student details by searching particular student using their name from the array in which Student objects are stored.
7. delete(): This is the method used to delete a Student object by searching particular student using their name from the array in which Student objects are stored.

Student.java contains InputUser class with following methods:

1. It contains getter and setter methods for all the private variables like prn, name, dob and marks stored in a single Student object.
2. It also contains parameterized constructor with all the variables prn, name, dob and marks.

Main.java contains Main class with following methods:

1. It contains switch case where user is allowed to enter a character for particular operations.
2. It contains main method inside which there's switch case for menu to select operations among Add Student, Display, Search(by prn), Search(by name), Search(by position), Edit Details and Delete.
3. Main method catches the returned values from different methods of Operations class and display them.
