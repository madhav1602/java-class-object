import java.util.Scanner;

// Class to represent a Circle
class Circle {
    public double r;

    // Constructor to initialize radius
    public Circle(double r) {
        this.r = r;
    }

    // Method to calculate area of the circle
    public double getArea() {
        return Math.PI * r * r;
    }

    // Method to calculate circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * r;
    }

    // Method to display area and circumference
    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.display();

    }
}
