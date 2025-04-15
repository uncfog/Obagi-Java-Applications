import java.util.Scanner;

public class MultipleChecker {

    // Method to check if b is a multiple of a
    public static boolean isMultiple(int a, int b) {
        // If b is divisible by a, then b is a multiple of a
        return b % a == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Start a loop to keep reading pairs of integers
        while (true) {
            // Get user input for the first and second integers
            System.out.print("Enter the first integer (or enter 0 to quit): ");
            int a = input.nextInt();

            // Check if the user wants to quit
            if (a == 0) {
                break;  // Exit the loop if a is 0
            }

            System.out.print("Enter the second integer: ");
            int b = input.nextInt();

            // Call the isMultiple method and display the result
            if (isMultiple(a, b)) {
                System.out.println(b + " is a multiple of " + a);
            } else {
                System.out.println(b + " is not a multiple of " + a);
            }
        }

        input.close();
    }
}
