import java.util.Scanner;

class MobilePhone {
    public String brand;
    public String model;
    public double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for mobile phone details
        System.out.print("Enter mobile brand: ");
        String brand = sc.next();

        System.out.print("Enter mobile model: ");
        String model = sc.next();

        System.out.print("Enter mobile price: ");
        double price = sc.nextDouble();

        // Creating MobilePhone object and displaying details
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.display();

    }
}
