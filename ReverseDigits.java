import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of a number
    public static int reverseDigits(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // Get the last digit
            reversed = reversed * 10 + digit;  // Append the digit
            number /= 10;                 // Remove the last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();

        // Call the method to reverse digits
        int reversedNumber = reverseDigits(number);

        // Display the result
        System.out.println("Reversed number: " + reversedNumber);

        input.close();
    }
}
