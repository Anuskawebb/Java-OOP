class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds to withdraw " + amount);
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankDatabase {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Anuska Sarkar", 12345, 1000.0);
        account1.displayAccountInfo();
        
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(1500.0);
        
        System.out.println("Final Balance: " + account1.getBalance());
    }
}
