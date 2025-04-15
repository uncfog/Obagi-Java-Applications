public class NumberSystemsTable {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");

        // Loop through decimal numbers 1 to 256
        for (int decimal = 1; decimal <= 256; decimal++) {
            // Convert decimal to binary, octal, and hexadecimal
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            // Print each row of the table
            System.out.printf("%-10d%-10s%-10s%-10s%n", decimal, binary, octal, hexadecimal);
        }
    }
}
