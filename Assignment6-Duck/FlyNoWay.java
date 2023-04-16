// FlyNoWay class implementing interface FlyBehavior
public class FlyNoWay implements FlyBehavior{
    // Implementing fly method from the inherited interface
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
