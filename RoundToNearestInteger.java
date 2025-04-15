import java.util.Scanner;

public class RoundToNearestInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal number (or type 'q' to quit): ");

            // Check if next input is a double
            if (input.hasNextDouble()) {
                double original = input.nextDouble();
                long rounded = (long) Math.floor(original + 0.5);
                System.out.printf("Original: %.3f → Rounded: %d%n", original, rounded);
            } 
            // If user types 'q' or other non-number, break
            else {
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")) {
                    System.out.println("Exiting program.");
                    break;
                } else {
                    System.out.println("Invalid input. Enter a decimal number or 'q' to quit.");
                }
            }
        }

        input.close();
    }
}
