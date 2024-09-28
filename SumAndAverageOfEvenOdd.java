public class SumAndAverageOfEvenOdd {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }

        // Initialize variables to store sums and counts
        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;

        // Iterate over command line arguments
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                
                if (number % 2 == 0) {
                    // Number is even
                    evenSum += number;
                    evenCount++;
                } else {
                    // Number is odd
                    oddSum += number;
                    oddCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + arg);
                return;
            }
        }

        // Calculate averages
        double evenAverage = (evenCount > 0) ? (double) evenSum / evenCount : 0;
        double oddAverage = (oddCount > 0) ? (double) oddSum / oddCount : 0;

        // Print results
        System.out.println("Even numbers - Sum: " + evenSum + ", Average: " + String.format("%.2f", evenAverage));
        System.out.println("Odd numbers - Sum: " + oddSum + ", Average: " + String.format("%.2f", oddAverage));
    }
}
