import java.util.Scanner;

class MovieTicket {
    public String movieName;
    public int seatNumber;
    public double price;
    public boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for movie name
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName);

        // Taking user input for seat number and price
        System.out.print("Enter seat number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        // Booking the ticket
        ticket.bookTicket(seatNumber, price);

        // Displaying ticket details
        ticket.displayTicket();

    }
}
