public class AsteriskSquare {

    // Method to display a square of asterisks
    public static void squareOfAsterisks(int side) {
        // Outer loop controls the number of rows
        for (int i = 0; i < side; i++) {
            // Inner loop prints asterisks in each row
            for (int j = 0; j < side; j++) {
                System.out.print("*");  // Print an asterisk without moving to the next line
            }
            System.out.println();  // After printing all asterisks in a row, move to the next line
        }
    }

    public static void main(String[] args) {
        // Example of using the squareOfAsterisks method
        int side = 4;  // Set the side length of the square
        squareOfAsterisks(side);  // Call the method to print the square
    }
}
