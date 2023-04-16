// Subclass RubberDuck inherited from Duck abstract class implementing display method from the super class
public class RubberDuck extends Duck{
    // Implementing method display
    @Override
    public void display() {
        System.out.println("This is RubberDuck.");
    }
    // Constructor setting up different behaviors of the duck
    RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
}
