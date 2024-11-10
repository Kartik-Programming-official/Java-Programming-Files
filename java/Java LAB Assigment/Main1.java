abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHolderName;
    protected String address;

    public Accounts(double balance, int accountNumber, String accountHolderName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    // Abstract method to withdraw money
    public abstract void withdrawal(double amount);

    // Abstract method to deposit money
    public abstract void deposit(double amount);

    // Method to display the balance of the account
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(double balance, int accountNumber, String accountHolderName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    // Method to calculate the interest amount
    public double calculateAmount() {
        return balance * rateOfInterest / 100;
    }

    // Overridden method to deposit money
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Overridden method to withdraw money
    @Override
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000, 123456, "John Doe", "123 Main St", 5.0);

        // Deposit some money
        savingsAccount.deposit(2000);

        // Withdraw some money
        savingsAccount.withdrawal(1000);

        // Display the balance
        savingsAccount.display();

        // Calculate and display the interest amount
        System.out.println("Interest Amount: " + savingsAccount.calculateAmount());
    }
}