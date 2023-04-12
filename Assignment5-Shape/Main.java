import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 1;
        while(j==1) {
            // Taking in choice by the user of which shape
            System.out.println("Choose a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    // Creating circle and printing the state, and area of the shape.
                    System.out.println("Enter the Radius of the circle");
                    Circle circ = new Circle(sc.nextDouble());
                    circ.stateShape("Circle");
                    circ.calculateArea();
                    break;

                case 2:
                    // Creating rectangle and printing the state, and area of the shape.
                    System.out.println("Enter the Length and Breadth of the Rectangle");
                    Rectangle rec = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    rec.stateShape("Rectangle");
                    rec.calculateArea();
                    break;

                case 3:
                    // Creating square and printing the state, and area of the shape.
                    System.out.println("Enter the Side of the Square");
                    Square sq = new Square(sc.nextFloat());
                    sq.stateShape("Square");
                    sq.calculateArea();
                    break;

                case 4:
                    // Creating sphere and printing the state, volume and area of the shape.
                    System.out.println("Enter the Radius of the Sphere");
                    Sphere sh = new Sphere(sc.nextDouble());
                    sh.stateShape("Sphere");
                    sh.calculateVolume();
                    sh.calculateArea();
                    break;

                case 5:
                    // Creating cylinder and printing the state, volume and area of the shape.
                    System.out.println("Enter the Radius and Height of the Cylinder");
                    Cylinder cl = new Cylinder(sc.nextDouble(), sc.nextDouble());
                    cl.stateShape("Cylinder");
                    cl.calculateVolume();
                    cl.calculateArea();
                    break;

                case 6:
                    // Creating pyramid and printing the state, volume and area of the shape.
                    System.out.println("Enter the Base and Height of the Pyramid");
                    Pyramid pr = new Pyramid(sc.nextDouble(), sc.nextDouble());
                    pr.stateShape("Pyramid");
                    pr.calculateVolume();
                    pr.calculateArea();
                    break;

                default:
                    System.out.println("You have entered thw wrong input.");
            }
            // If the user wants to continue or not
            System.out.print("Do you want to try again?(1/0): ");
            j = sc.nextInt();
        }

        sc.close();
    }
}