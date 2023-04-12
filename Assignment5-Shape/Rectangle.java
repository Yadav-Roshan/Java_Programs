public class Rectangle extends Shape{

    private double length;
    private double breadth;

    // Constructor for Rectangle class to take in length and breadth of rectangle
    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    // Calculating area of the rectangle overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double area = this.length * this.breadth;
        System.out.println("The area of Rectangle is " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (this.length * this.breadth);
        System.out.println("The perimeter of Rectangle is " + perimeter);
    }
}