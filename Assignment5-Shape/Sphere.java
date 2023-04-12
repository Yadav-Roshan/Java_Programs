public class Sphere extends Shape implements Volume {
    private double radius;

    // Constructor for Sphere class to take in radius of sphere
    Sphere(double r) {
        this.radius = r;
    }

    // Calculating volume of the sphere overriding the abstract method from Volume Class
    @Override
    public void calculateVolume() {
        double vol = (4/3) * Math.PI * Math.pow(this.radius, 3);
        System.out.println("The Volume of Sphere is: " + vol);
    }

    // Calculating surface area of the sphere overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double area = 4 * Math.PI * Math.pow(this.radius, 3);
        System.out.println("The Area of Sphere is: "+ area);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("No perimeter for Sphere");
    }
}