import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        // Static array for months of the year
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Static array for number of days in each month
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (e.g., January, February): ");
        String month = scanner.nextLine().trim();

        // Find the month index
        int monthIndex = -1;
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(month)) {
                monthIndex = i;
                break;
            }
        }

        if (monthIndex == -1) {
            System.out.println("Invalid month name.");
        } else {
            // Print the number of days for the given month
            int days = daysInMonth[monthIndex];
            System.out.println("The number of days in " + month + " is: " + days);
        }

        scanner.close();
    }
}
