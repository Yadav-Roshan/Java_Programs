abstract public class Shape {
    // Non-abstract method which print out which is shape class is using this class.
    public void stateShape(String shape) {
        System.out.println("The shape is: " + shape);
    }

    // Abstract method that needs to be overridden where the class in extended.
    abstract public void calculateArea();
}