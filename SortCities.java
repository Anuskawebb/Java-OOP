public class SortCities {
    public static void main(String[] args) {
        // Check if there are enough arguments
        if (args.length == 0) {
            System.out.println("Please provide city names as command-line arguments.");
            return;
        }

        // Bubble sort algorithm to sort the city names
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - 1 - i; j++) {
                if (args[j].compareToIgnoreCase(args[j + 1]) > 0) {
                    // Swap args[j] and args[j + 1]
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }

        // Display the sorted city names
        System.out.println("Cities in alphabetical order:");
        for (String city : args) {
            System.out.println(city);
        }
    }
}
