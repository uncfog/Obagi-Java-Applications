import java.util.Scanner;

public class RoundingNumbers {

    // a) Round to nearest integer
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // b) Round to tenths (1 decimal place)
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // c) Round to hundredths (2 decimal places)
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // d) Round to thousandths (3 decimal places)
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal number (or 'q' to quit): ");

            if (input.hasNextDouble()) {
                double original = input.nextDouble();

                System.out.printf("Original: %.5f%n", original);
                System.out.printf("Rounded to Integer: %.0f%n", roundToInteger(original));
                System.out.printf("Rounded to Tenths: %.1f%n", roundToTenths(original));
                System.out.printf("Rounded to Hundredths: %.2f%n", roundToHundredths(original));
                System.out.printf("Rounded to Thousandths: %.3f%n", roundToThousandths(original));
                System.out.println();
            } else {
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")) {
                    System.out.println("Exiting program.");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                }
            }
        }

        input.close();
    }
}
