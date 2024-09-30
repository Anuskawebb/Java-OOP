import java.util.Scanner;

public class EmployeeIncomeTaxCalculate {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the income
        System.out.print("Enter the employee's earning (Rs.): ");
        double earning = scanner.nextDouble();

        // Calculate the income tax
        double tax = calculateIncomeTax(earning);

        // Display the result
        System.out.println("Income tax to be paid is: Rs. " + tax);
    }

    // Method to calculate the income tax based on the earning
    public static double calculateIncomeTax(double earning) {
        double tax = 0.0;

        if (earning <= 50000) {
            // No tax for income up to Rs. 50,000
            tax = 0.0;
        } else if (earning <= 60000) {
            // 10% tax for the income between Rs. 50,001 to Rs. 60,000
            tax = (earning - 50000) * 0.10;
        } else if (earning <= 150000) {
            // 10% tax on Rs. 10,000 (from Rs. 50,001 to Rs. 60,000)
            // 20% tax for the income between Rs. 60,001 to Rs. 1,50,000
            tax = (10000 * 0.10) + (earning - 60000) * 0.20;
        } else {
            // 10% tax on Rs. 10,000 (from Rs. 50,001 to Rs. 60,000)
            // 20% tax on Rs. 90,000 (from Rs. 60,001 to Rs. 1,50,000)
            // 30% tax for the income above Rs. 1,50,000
            tax = (10000 * 0.10) + (90000 * 0.20) + (earning - 150000) * 0.30;
        }

        return tax;
    }
}
