public class DynamicMemoryInit {
    public static void main(String[] args) {
        // Dynamically allocate memory for a 2D array where each row has varying lengths
        int[][] array = new int[4][]; 
        
        // Initialize each row with the required values
        array[0] = new int[] {1, 2, 3, 4};  // 1st row
        array[1] = new int[] {2, 4, 6};     // 2nd row
        array[2] = new int[] {3, 6};        // 3rd row
        array[3] = new int[] {4};           // 4th row

        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to next line after printing each row
        }
    }
}
