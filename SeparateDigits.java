import java.util.Scanner;

public class SeparateDigits {

    // Method to calculate the integer part of the quotient (integer division)
    public static int integerPartOfQuotient(int a, int b) {
        return a / b;  // Integer division returns the quotient (integer part)
    }

    // Method to calculate the integer remainder
    public static int integerRemainder(int a, int b) {
        return a % b;  // Modulo operator returns the remainder
    }

    // Method to display digits with two spaces between them
    public static void displayDigits(int number) {
        // Check if the number is within the valid range
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999");
            return;
        }

        // Extract digits starting from the leftmost (most significant) digit
        int divisor = 10000;  // Start with 10000 to extract the first digit
        while (divisor > 0) {
            int digit = integerPartOfQuotient(number, divisor);  // Get the integer part of the quotient
            System.out.print(digit + "  ");  // Print the digit followed by two spaces
            number = integerRemainder(number, divisor);  // Get the remainder of the division
            divisor /= 10;  // Decrease divisor to extract the next digit
        }

        System.out.println();  // Move to the next line after displaying all digits
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for an integer between 1 and 99999
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        // Call the displayDigits method to display the digits
        displayDigits(number);

        input.close();  // Close the scanner to prevent resource leak
    }
}
