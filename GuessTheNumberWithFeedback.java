import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithFeedback {

    // Method to play one round of the game
    public static void playGame() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = rand.nextInt(1000) + 1; // Random number from 1 to 1000
        int guess;
        int guessCount = 0;

        System.out.println("Guess a number between 1 and 1000.");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            guessCount++;

            if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " + guessCount + " attempts.");

                // Feedback based on number of guesses
                if (guessCount < 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                } else if (guessCount == 10) {
                    System.out.println("Aha! You know the secret!");
                } else {
                    System.out.println("You should be able to do better!");
                }
            }

        } while (guess != numberToGuess);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        System.out.println("🎯 Welcome to the Guess the Number Game!");

        do {
            playGame();

            System.out.print("\nWould you like to play again? (yes/no): ");
            playAgain = input.next().toLowerCase();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("Thanks for playing! 👋");
        input.close();
    }
}
