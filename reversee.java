import java.util.Scanner;

public class reversee{
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Print the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
