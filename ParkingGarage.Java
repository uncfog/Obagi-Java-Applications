import java.util.Scanner;

public class ParkingGarage {

    // Method to calculate charges
    public static double calculateCharges(double hoursParked) {
        double charge = 2.00; // minimum charge for up to 3 hours

        if (hoursParked > 3) {
            charge += Math.ceil(hoursParked - 3) * 0.50;
        }

        // Maximum charge cap
        if (charge > 10.00) {
            charge = 10.00;
        }

        return charge;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        int customerNumber = 1;

        while (true) {
            System.out.print("Enter hours parked for customer " + customerNumber + " (or -1 to quit): ");
            double hours = input.nextDouble();

            if (hours == -1) {
                break;
            }

            if (hours < 0 || hours > 24) {
                System.out.println("Invalid input. Hours must be between 0 and 24.");
                continue;
            }

            double charge = calculateCharges(hours);
            System.out.printf("Customer %d charge: $%.2f%n", customerNumber, charge);
            totalReceipts += charge;
            customerNumber++;
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }
}
