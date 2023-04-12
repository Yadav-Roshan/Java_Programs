This is the directory for the Assignment 5: Shape

This folder contains 9 java files out of which 8 are classes and one is interface:

1. Shape.java
2. Volume.java
3. Circle.java
4. Rectangle.java
5. Square.java
6. Sphere.java
7. Cylinder.java
8. Pyramid.java
9. Main.java

Shape.java contains three functions:
1. stateShape(): Non-abstract method which print out which is shape class is using this class.
2. calculateArea(): Abstract method for area calculation that needs to be overridden where the class in extended
3. calculatePerimeter(): Abstract method for perimeter calculation that needs to be overridden where the class in extended

Volume.java contains one function:
1. calculateVolume(): Abstract method that needs to be overridden where the class in implemented

Circle.java contains two functions:
1. Circle(): Constructor of Circle class to take in radius of circle
2. calculateArea(): Calculating area of the circle overriding the abstract method from Shape class
3. calculatePerimeter(): Calculating perimeter of the circle overriding the abstract method from Shape class

Rectangle.java contains three functions:
1. Rectangle(): Constructor for Rectangle class to take in length and breadth of rectangle
2. calculateArea(): Calculating area of the rectangle overriding the abstract method from Shape class
3. calculatePerimeter(): Calculating perimeter of the rectangle overriding the abstract method from Shape class

Square.java contains three functions:
1. Square(): Constructor for Square class to take in side of the square
2. calculateArea(): Calculating area of the square overriding the abstract method from Shape class
3. calculatePerimeter(): Calculating perimeter of the square overriding the abstract method from Shape class

Sphere.java contains four functions:
1. Sphere(): Constructor for Sphere class to take in radius of sphere
2. culateArea(): Calculating surface area of the sphere overriding the abstract method from Shape class
3. culateVolume(): Calculating volume of the sphere overriding the abstract method from Volume Class
4. calculatePerimeter(): Since sphere has no perimeter just overriding the abstract method from Shape class

Cylinder.java contains four functions:
1. Cylinder(): Constructor of Cylinder class to take in radius and height of cylinder
2. calculateArea(): Calculating surface area of the cylinder overriding the abstract method from Shape class
3. calculateVolume(): Calculating volume of the cylinder overriding the abstract method from Volume Class
4. calculatePerimeter(): Since sphere has no perimeter just overriding the abstract method from Shape class

Pyramid.java contains four functions:
1. Pyramid(): Constructor of Pyramid class tot ake in base and height of pyramid
2. calculateArea(): Calculating surface area of the pyramid overriding the abstract method from Shape class
3. calculateVolume(): Calculating volume of the pyramid overriding the abstract method from Volume Class
4. calculatePerimeter(): Since sphere has no perimeter just overriding the abstract method from Shape class

Main.java does the following functions:
Lets the user choose 1,2,3,4,5,6.
1. If 1, creates circle, takes in radius of circle and prints the state and area of circle.
2. If 2, creates rectangle, takes in length and breadth of rectangle and prints the state and area of rectangle.
3. If 3, creates square, takes in side of square and prints the state and area of square.
4. If 1, creates sphere, takes in radius of sphere and prints the state, area and volume of sphere.
5. If 5, creates cylinder, takes in radius and height of cylinder and prints the state, area and volume of cylinder.
6. If 6, creates pyramid, takes in base and height of pyramid and prints the state, area and volume of pyramid.
