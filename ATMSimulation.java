import java.util.Scanner;

class BankAccount {
    public String accountHolder;
    public String accountNumber;
    public double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money if sufficient balance exists
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for account details
        System.out.print("Enter account holder name: ");
        String accountHolder = sc.next();

        System.out.print("Enter account number: ");
        String accountNumber = sc.next();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Creating BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Performing operations
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final balance
        account.displayBalance();

    }
}
