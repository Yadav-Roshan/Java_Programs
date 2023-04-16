// Subclass MallardDuck inherited from Duck abstract class implementing display method from the super class
public class MallardDuck extends Duck {

    // Implementing method display
    @Override
    public void display() {
        System.out.println("This is MallardDuck");
    }

    // Constructor setting up different behaviors of the duck
    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new SwimChhapChhap();
    }
}