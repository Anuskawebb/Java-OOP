// Class to calculate factorial
class Fact {
    // Method to calculate factorial
    public int calculateFactorial(int n) {
        int result = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

// Main class to execute the program
public class Factorial {
    public static void main(String[] args) {
        // Create an object of the FactorialCalculator class
        Fact calculator = new Fact();

        // Define the number for which the factorial is to be calculated
        int number = 5;

        // Calculate the factorial using the calculateFactorial method
        int factorial = calculator.calculateFactorial(number);

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
