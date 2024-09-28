public class pattern {
    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 5;

        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to handle the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
