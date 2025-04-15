import java.util.Scanner;

public class MathClassMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter Number: ");
        double num = scan.nextDouble();

        System.out.printf("The absolute value is %f%n", Math.abs(num));
        System.out.printf("The rounded value is %d%n", Math.round(Math.abs(num)));
        System.out.printf("%f raised to the power of 2 is %f%n", num, Math.pow(num, 2));
        System.out.printf("The square root of %f is %f%n", num, Math.sqrt(num));
        
        System.out.println("___________________________________________");

        System.out.printf("Enter First Number: ");
        double num1 = scan.nextDouble();

        System.out.printf("Enter Second Number: ");
        double num2 = scan.nextDouble();

        System.out.printf("The minimum value is %f%n", Math.min(num1, num2));
        System.out.printf("The maximum value is %f%n", Math.max(num1, num2));    

        System.out.println("___________________________________________");

        // Circle area calculation
        System.out.println("The area of a circle");

        System.out.printf("Enter radius: ");
        double radius = scan.nextDouble();

        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.2f%n", areaOfCircle);

        scan.close(); // Always close the scanner
    }
}

