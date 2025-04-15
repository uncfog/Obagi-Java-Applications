import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Method to convert Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to choose the conversion type
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            // Convert Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsiusValue = celsius(fahrenheit);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", fahrenheit, celsiusValue);
        } else if (choice == 2) {
            // Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheitValue = fahrenheit(celsius);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheitValue);
        } else {
            System.out.println("Invalid choice! Please enter either 1 or 2.");
        }

        input.close(); // Close the scanner
    }
}
