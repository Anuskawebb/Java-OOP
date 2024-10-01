public class BankAccount {
    // Fields to store account number and balance
    private String accountNumber;
    private double balance;

    // Constructor to initialize account with an account number and starting balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew Rs." + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    // Method to return the current balance
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate the operations
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount myAccount = new BankAccount("123456789", 50000);

        // Demonstrating deposit, withdraw, and balance check operations
        myAccount.deposit(10000);
        myAccount.withdraw(5000);
        System.out.println("Current balance: Rs." + myAccount.getBalance());
    }
}
