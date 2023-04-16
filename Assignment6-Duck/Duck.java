// Abstract class Duck with all methods for a duck about swim, quack and fly behavior
public abstract class Duck {
    // Variable of interface flyBehavior
    FlyBehavior flyBehavior;
    // Variable of interface quackBehavior
    QuackBehavior quackBehavior;
    // Variable of interface swimBehavior
    SwimBehavior swimBehavior;
    // Abstract method display to be implemented each subclass
    abstract public void display();
    // Methods to set different behaviors like swim, quack and fly.
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }
    // Methods to perform those behaviors
    public void performQuack(){
        flyBehavior.fly();
    }
    public void performFly(){
        quackBehavior.quack();
    }
    public void performSwim(){
        swimBehavior.swim();
    }

}
