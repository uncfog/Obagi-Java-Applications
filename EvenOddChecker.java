import java.util.Scanner;

public class EvenOddChecker {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;  // Return true if the number is divisible by 2 (even)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loop to read multiple integers and check if they are even or odd
        while (true) {
            System.out.print("Enter an integer (or enter 0 to quit): ");
            int number = input.nextInt();

            // Exit the loop if the user enters 0
            if (number == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            // Check if the number is even or odd using the isEven method
            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        input.close();  // Close the scanner resource
    }
}
