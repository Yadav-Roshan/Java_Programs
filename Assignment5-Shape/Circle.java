public class Circle extends Shape{
    
    private double radius;

    // Constructor of Circle class to take in radius of circle
    Circle(double d) {
        this.radius = d;
    }

    // Calculating area of the circle overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(this.radius,2);
        System.out.println("The Area of Circle is "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("The perimeter of Circle is " + perimeter);
    }

}