import java.util.Scanner;

public class IT24103535Lab3Q4 {
    public static void main(String[] args) {
        
        // Declare variables for the 5 digits
        int num, n1, n2, n3, n4, n5;
        
        // Create scanner class
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a five-digit number: ");
        num = input.nextInt();
        
        // Calculations using base-10 math
        n1 = num / 10000;      // Gets the 1st digit (e.g., 52348 / 10000 = 5)
        num = num % 10000;    // Removes the 1st digit 2348
        
        n2 = num / 1000;       // (2348 / 1000 = 2)
        num = num % 1000;     //  348
        
        n3 = num / 100;        //  (348 / 100 = 3)
        num = num % 100;      //  48
        
        n4 = num / 10;         //
        n5 = num % 10;         
        
        // Print output 
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        
    }
}