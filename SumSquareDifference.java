import java.util.Scanner;

public class SumSquareDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int sumOfSquares = 0;
        int sum = 0;


        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            sumOfSquares += number * number; // Sum of squares
            sum += number; // Sum of numbers
        }

        
        int squareOfSum = sum * sum;


        int difference = squareOfSum - sumOfSquares;

        
        System.out.println("Difference between square of the sums and sum of the squares: " + difference);
        
        scanner.close();
    }
}
