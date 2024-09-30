public class MaxNumberFromArgs {

    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }

        // Initialize the first number as the maximum
        double max = Double.parseDouble(args[0]);

        // Loop through the command line arguments to find the maximum number
        for (int i = 1; i < args.length; i++) {
            double currentNumber = Double.parseDouble(args[i]);
            if (currentNumber > max) {
                max = currentNumber;
            }
        }

        // Output the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
