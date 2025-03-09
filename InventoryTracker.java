import java.util.Scanner;

class Item {
    public int itemCode;
    public String itemName;
    public double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display
    public void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for item details
        System.out.print("Enter item code: ");
        int itemCode = sc.nextInt();

        System.out.print("Enter item name: ");
        String itemName = sc.next();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        // Creating object
        Item item = new Item(itemCode, itemName, price);

        // Displaying
        item.display();

        // Taking input for quantity and calculating total cost
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));


    }
}
