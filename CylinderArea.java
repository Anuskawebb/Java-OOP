import java.util.Scanner;

public class CylinderArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the cylinder's base: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        
        double surfaceArea = calculateSurfaceArea(radius, height);

       
        System.out.printf("The surface area of the cylinder is: %.2f%n", surfaceArea);
        
        scanner.close();
    }

    
    public static double calculateSurfaceArea(double radius, double height) {
        double baseArea = Math.PI * radius * radius; 
        double lateralArea = 2 * Math.PI * radius * height; 
        return 2 * baseArea + lateralArea; 
    }
}
