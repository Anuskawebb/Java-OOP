public class PrimeNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide integers as command-line arguments.");
            return;
        }

        System.out.println("Prime numbers in the given array:");
        
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (isPrime(num)) {
                    System.out.println(num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not an integer.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
