// Class MuteQuack implementing another quackBehavior
public class MuteQuack implements QuackBehavior{
    // Implementing quack method from the interface
    @Override
    public void quack() {
        System.out.println("I am on Mute..");
    }
}
