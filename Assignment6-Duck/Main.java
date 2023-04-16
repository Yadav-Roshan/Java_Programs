
// Main Class
public class Main {
    // Main method calling all the methods from the objects
    public static void main(String[] args)
    {
        // Object and methods for MallardDuck
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

        System.out.println("---------------------------------------------");
        // Object and methods for RubberDuck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        System.out.println("---------------------------------------------");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();
    }
}