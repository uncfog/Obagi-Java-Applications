import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Method to play one round of the game
    public static void playGame() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = rand.nextInt(1000) + 1; // Random number between 1-1000
        int guess = 0;

        System.out.println("Guess a number between 1 and 1000.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to the Guess the Number Game!");

        do {
            playGame();

            // Ask if the user wants to play again
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = input.next().toLowerCase();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("Thanks for playing! Goodbye!");
        input.close();
    }
}
