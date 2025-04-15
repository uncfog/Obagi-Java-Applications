import java.util.Scanner;

public class DistanceBetweenPoints {

    // Method to calculate distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for point 1
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Prompt the user for point 2
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate and display distance
        double dist = distance(x1, y1, x2, y2);
        System.out.printf("The distance between the points is: %.4f%n", dist);

        input.close();
    }
}
