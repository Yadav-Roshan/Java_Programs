// Drown class implementing interface SwimBehavior
public class Drown implements SwimBehavior{
    // Implementing swim method from the inherited interface
    @Override
    public void swim() {
        System.out.println("I am drowning. I can't swim.");
    }
}
