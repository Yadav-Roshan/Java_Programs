import org.w3c.dom.ls.LSOutput;
// Class Squeak implementing another quackBehavior
public class Squeak implements QuackBehavior{
    // Implementing quack method from the interface
    @Override
    public void quack() {
        System.out.println("Squeak Squeak!!");
    }
}
