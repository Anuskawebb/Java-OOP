import java.util.Scanner;

public class BestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] marks = new int[10][5];
        String[] students = new String[10];
        double[] averages = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
            System.out.println("Enter marks for 5 subjects for " + students[i] + ":");
            
            int total = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }
            averages[i] = total / 5.0;
            sc.nextLine();  // Clear the newline character from the buffer
        }
        
        int bestStudentIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (averages[i] > averages[bestStudentIndex]) {
                bestStudentIndex = i;
            }
        }
        
        System.out.println("\nBest Student: " + students[bestStudentIndex]);
        System.out.println("Average Marks: " + averages[bestStudentIndex]);
        System.out.println("Marks in each subject: ");
        
        for (int j = 0; j < 5; j++) {
            System.out.println("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j]);
        }
        
        sc.close();
    }
}
