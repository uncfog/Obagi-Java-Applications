import java.util.Scanner;

public class SquareWithCustomCharacter {

    // Method to display a square using the fillCharacter
    public static void squareOfAsterisks(int side, char fillCharacter) {
        // Outer loop controls the number of rows
        for (int i = 0; i < side; i++) {
            // Inner loop prints the fillCharacter in each row
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);  // Print the provided character without moving to the next line
            }
            System.out.println();  // After printing all characters in a row, move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the side length of the square from the user
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        // Read the fill character from the user
        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);  // Reads the first character of the input

        // Call the method to display the square
        squareOfAsterisks(side, fillCharacter);

        input.close();  // Close the scanner to prevent resource leak
    }
}
