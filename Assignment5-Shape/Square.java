public class Square extends Shape {

    private double side;

    // Constructor for Square class to take in side of the square
    Square(double s) {
        this.side = s;
    }

    // Calculating area of the square overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double area = Math.pow(this.side,2);
        System.out.println("The Area of Square is "+area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (this.side * this.side);
        System.out.println("The perimeter of Square is " + perimeter);
    }
}