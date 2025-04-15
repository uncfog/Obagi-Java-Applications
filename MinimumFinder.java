import java.util.Scanner;

public class MinimumFinder {

    // Method to find the minimum of three numbers using Math.min
    public static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);  // Find the smallest value among the three numbers
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three floating-point numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Call the minimum3 method to find the smallest value
        double smallest = minimum3(num1, num2, num3);

        // Display the result
        System.out.printf("The smallest number is: %.2f\n", smallest);

        input.close();  // Close the scanner to prevent resource leak
    }
}
