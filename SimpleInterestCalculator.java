import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the principal amount (initial investment): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();


        double interestRateDecimal = annualInterestRate / 100;


        double totalInterest = principal * interestRateDecimal * (months / 12.0);
        
       
        double finalBalance = principal + totalInterest;
        System.out.printf("The balance after %d months is: %.2f%n", months, finalBalance);
        
        
        scanner.close();
    }
}
