This is the directory for the ## Assignment 6: Duck

This folder contains 16 java files out of which 13 are classes and 3 are interfaces:

1.  Main
2.	Duck (Abstract Class)
3.	MallardDuck
4.	RubberDuck
5.	DecoyDuck
6.	FlyBehavior (interface)
7.	FlyWithWings
8.	FlyNoWay
9.	QuackBehavior (interface)
10.	Quack
11.	MuteQuack
12.	Squeak
13.	SwimBehavior (interface)
14.	SwimChhapChhap
15.	Float
16.	Drown

Main.java does the following functions:
It executes the display, performSwim, performFly and performQuack methods for all the Duck subclasses MallardDuck, RubberDuck and DecoyDuck.

Duck.java contains:
1. Variables of all the interfaces for behavior: FlyBehavior, QuackBehavior, SwimBehavior 
2. display(): Abstract method which print out which is Duck it is.
3. setFlyBehavior(): Set the variable of FlyBehavior to appropriate class
4. setQuackBehavior(): Set the variable of QuackBehavior to appropriate class
5. setSwimBehavior(): Set the variable of SwimBehavior to appropriate class

MallardDuck.java contains:
1. display(): Implementation of abstract method of Duck class which tells which duck it is.
2. MallardDuck(): Constructor of MallardDuck class setting up different behaviors

RubberDuck.java contains:
1. display(): Implementation of abstract method of Duck class which tells which duck it is.
2. RubberDuck(): Constructor of RubberDuck class setting up different behaviors.

DecoyDuck.java contains:
1. display(): Implementation of abstract method of Duck class which tells which duck it is.
2. DecoyDuck(): Constructor of DecoyDuck class setting up different behaviors.

FlyBehavior.java contains:
  It's an interface with
1. fly(): Abstract method to be implemented in each class defining the particular swim behavior for ducks

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

