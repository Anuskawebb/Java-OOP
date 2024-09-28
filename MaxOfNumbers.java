public class MaxOfNumbers {

    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }

        // Initialize max with the first argument converted to an integer
        int max = Integer.parseInt(args[0]);

        // Loop through the arguments to find the maximum
        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
