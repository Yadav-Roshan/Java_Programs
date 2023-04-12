public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    // Constructor of Cylinder class to take in radius and height of cylinder
    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    // Calculating volume of the cylinder overriding the abstract method from Volume Class
    @Override
    public void calculateVolume() {
        double vol = Math.PI * Math.pow(this.radius, 2) * this.height;
        System.out.println("The Volume of Cylinder is: " + vol);
    }

    // Calculating surfave area of the cylinder overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double area = 2 * Math.PI * this.radius * (this.radius + this.height);
        System.out.println("The Area of Cylinder is: " + area);
    }
    
}