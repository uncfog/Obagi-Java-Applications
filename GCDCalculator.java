import java.util.Scanner;

public class GCDCalculator {

    // Method to compute GCD using Euclid's algorithm
    public static int gcd(int a, int b) {
        // Ensure positive values
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers from user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Calculate GCD
        int result = gcd(num1, num2);

        // Display result
        System.out.println("The greatest common divisor (GCD) of " + num1 + " and " + num2 + " is: " + result);

        input.close();
    }
}
