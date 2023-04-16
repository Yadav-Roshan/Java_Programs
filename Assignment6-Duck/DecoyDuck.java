// Class DecoyDuck inherited from abstract class Duck
public class DecoyDuck extends Duck{
    // Implementing display from Duck class
    @Override
    public void display() {
        System.out.println("This is DecoyDuck.");
    }
    // Constructor defining fly, quack and swim behaviour
    DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new Drown();
    }
}
