import java.util.Scanner;

public class PowerCalculation {

    // Method to calculate base^exponent
    public static int integerPower(int base, int exponent) {
        int result = 1;
        // Use a for loop to multiply base 'exponent' number of times
        for (int i = 1; i <= exponent; i++) {
            result *= base;  // Multiply result by base each time
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for base and exponent
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        // Call integerPower method and display result
        int result = integerPower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        input.close();
    }
}
