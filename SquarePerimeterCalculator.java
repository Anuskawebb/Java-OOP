import java.util.Scanner;

public class SquarePerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the area of the square: ");
        double area = scanner.nextDouble();
        
        
        double sideLength = Math.sqrt(area);
        

        double perimeter = 4 * sideLength;
        
        
        System.out.println("The perimeter of the square is: " + perimeter);
        

        scanner.close();
    }
}
