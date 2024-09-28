// class first{  
//     public static void main(String args[]){  
//      System.out.println("Hello Java");  
//     }  
// }  

// class first{
//     public  static void main(String args[]){
//         System.out.println("Hello Java");
// }
// // }
import java.util.Scanner;
class first{
    public  static void main(String args[]){
        
         int [] marks={97,98,95};
        int [][] marks={{97,98,95},{67,98,99}};
        System.out.println(marks[0][0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age:");
        int age = sc.nextInt();
        System.out.println(age);
    }
}

// import java.util.Scanner;

// class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String input = sc.nextLine();  // Read the entire line of input

//         String[] words = input.split(" ");  // Split the string by spaces
//         StringBuilder reversedString = new StringBuilder();

//         // Iterate through the words array in reverse order
//         for (int i = words.length - 1; i >= 0; i--) {
//             reversedString.append(words[i]).append(" ");
//         }

//         // Print the reversed string after trimming the last space
//         System.out.println(reversedString.toString().trim());
//     }
// }
// class first {
//     public static void main(String[] args) {
//         int rows = 5;  // Number of rows to print

//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");  // Print star followed by a space
//             }
//             System.out.println();  // Move to the next line after each row
//         }
//     }
// }
// import java.util.Arraylist;

//  class first {

//     public static void main(String args[]) {

//         int [] rows = new int[5];
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//             rows[i] = i + 1;
//             list.add(i + 1);
//         }

//         System.out.println("using ArrayList");


//         System.out.println("First");
//     }