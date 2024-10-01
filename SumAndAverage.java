public class SumAndAverage {
    public static void main(String[] args) {
        
        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;


        for (String arg : args) {
            int num = Integer.parseInt(arg); // Convert argument to integer

            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }

  
        double evenAverage = (evenCount == 0) ? 0 : (double) evenSum / evenCount;
        double oddAverage = (oddCount == 0) ? 0 : (double) oddSum / oddCount;

      
        System.out.println("Even Numbers:");
        System.out.println("Sum: " + evenSum);
        System.out.println("Average: " + evenAverage);

        System.out.println("Odd Numbers:");
        System.out.println("Sum: " + oddSum);
        System.out.println("Average: " + oddAverage);
    }
}
