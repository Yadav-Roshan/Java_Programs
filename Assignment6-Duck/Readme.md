This is the directory for the Assignment 6: Duck

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
1. fly(): Abstract method to be implemented in each class defining the particular fly behavior for ducks

FlyWithWings.java contains:
1. fly(): Implementation of method fly from FlyBehavior saying this duck can fly.

FlyNoWay.java contains:
1. fly(): Implementation of method fly from FlyBehavior saying this duck can't fly.

QuackBehavior.java contains:
  It's an interface with
1. quack(): Abstract method to be implemented in each class defining the particular quack behavior for ducks

Quack.java contains:
1. quack(): Implementation of method quack from QuackBehavior saying that this duck makes quack sound

MuteQuack.java contains:
1. quack(): Implementation of method quack from QuackBehavior saying that this duck can't make quack sound.

Squeak.java contains:
1. quack(): Implementation of method quack from QuackBehavior saying that this duck makes squeak sound

SwimBehavior.java contains:
  It's an interface with
1. swim(): Abstract method to be implemented in each class defining the particular swim behavior for ducks

SwimChhapChhap.java contains:
1. swim(): Implementation of method swim from SwimBehavior saying that this duck can swim.

Float.java contains:
1. swim(): Implementation of method swim from SwimBehavior saying that this duck can float.

Drown.java contains:
1. swim(): Implementation of method swim from SwimBehavior saying that this duck can't swim.
