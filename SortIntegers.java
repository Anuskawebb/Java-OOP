public class SortIntegers {
    public static void main(String[] args) {
        // Check if there are arguments passed
        if (args.length == 0) {
            System.out.println("Please provide integer numbers as command-line arguments.");
            return;
        }

        // Convert command-line arguments to integer array
        int[] numbers = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]); // Convert each argument to an integer
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer numbers.");
            return;
        }

        // Bubble Sort to sort the array in ascending order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the numbers if they are in the wrong order
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display the sorted integers
        System.out.println("Sorted integers in ascending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
