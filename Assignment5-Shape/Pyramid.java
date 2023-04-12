public class Pyramid extends Shape implements Volume {
    private double base;
    private double height;

    // Constructor of Pyramid class tot ake in base and height of pyramid
    public Pyramid(double b, double h) {
        this.base = b;
        this.height = h;
    }

    // Calculating surface area of the pyramid overriding the abstract method from Shape class
    @Override
    public void calculateArea() {
        double ar = Math.pow(this.base, 2) + (2*this.base*Math.pow((Math.pow(this.base,2)/4) + Math.pow(this.height,2), 0.5));
        System.out.println("The Area of Pyramid is: "+ ar);
    }

    // Calculating volume of the pyramid overriding the abstract method from Volume Class
    @Override
    public void calculateVolume() {
        double vol = Math.pow(this.base,2)*this.height/3;
        System.out.println("The Volume of Pyramid is: "+vol);
    }
    
}