import java.util.Scanner;

public class IncomeTaxCalculator {

    // Method to calculate income tax based on income
    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 50000) {
            tax = 0;  // No tax for income up to Rs. 50,000
        } else if (income <= 60000) {
            tax = (income - 50000) * 0.10;  // 10% on the additional amount above Rs. 50,000
        } else if (income <= 150000) {
            tax = (60000 - 50000) * 0.10;  // 10% on Rs. 10,000
            tax += (income - 60000) * 0.20;  // 20% on the amount between Rs. 60,000 and Rs. 1,50,000
        } else {
            tax = (60000 - 50000) * 0.10;  // 10% on Rs. 10,000
            tax += (150000 - 60000) * 0.20;  // 20% on Rs. 90,000
            tax += (income - 150000) * 0.30;  // 30% on the amount above Rs. 1,50,000
        }

        return tax;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the employee's income
        System.out.print("Enter the employee's income: ");
        double income = scanner.nextDouble();

        // Calculate the income tax
        double tax = calculateTax(income);

        // Display the income tax to be paid
        System.out.printf("Income tax is: Rs. %.2f%n", tax);
    }
}
