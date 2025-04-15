import java.util.Scanner;

public class TriangleCalculations {

    // Method to calculate the hypotenuse using Pythagorean theorem
    public static double hypotenuse(double side1, double side2) {
        // Calculate the hypotenuse using Math.pow and Math.sqrt
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for side1 and side2
        System.out.print("Enter the length of side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = input.nextDouble();

        // Call hypotenuse method and display result
        double hypotenuseLength = hypotenuse(side1, side2);
        System.out.println("The hypotenuse is: " + hypotenuseLength);
        
        input.close();
    }
}
