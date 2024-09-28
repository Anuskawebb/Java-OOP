// First class to generate the Fibonacci series
class Fibonacciseries {
    // Method to generate Fibonacci series up to a specified number of terms
    public void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first);
        
        if (terms > 1) {
            System.out.print(", " + second);
        }
        
        for (int i = 2; i < terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        
        System.out.println();
    }
}

// Main class to run the program
public class Fibonacci {
    public static void main(String[] args) {
        // Create an object of the FibonacciGenerator class
        Fibonacciseries generator = new Fibonacciseries();

        // Number of terms to generate in the Fibonacci series
        int terms = 10;

        // Call the generateFibonacci method
        generator.generateFibonacci(terms);
    }
}
