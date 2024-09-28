class Cal {
    // Method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

public class calculator {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Cal calc = new Cal();

        // Variables to hold the numbers
        int num1 = 20;
        int num2 = 5;

        // Perform operations and display results
        int additionResult = calc.add(num1, num2);
        int subtractionResult = calc.subtract(num1, num2);
        int multiplicationResult = calc.multiply(num1, num2);
        double divisionResult = calc.divide(num1, num2);

        // Print the results
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
