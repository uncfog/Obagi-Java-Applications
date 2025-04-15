import java.util.Random;
import java.util.Scanner;

public class CrapsWithWager {

    // Enum for game status
    enum Status { CONTINUE, WON, LOST }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int bankBalance = 1000;
        System.out.println("🎲 Welcome to Craps with Wagering!");
        System.out.println("💰 You start with a bank balance of $" + bankBalance);

        while (bankBalance > 0) {
            int wager;

            // Get a valid wager
            do {
                System.out.print("\nEnter your wager: $");
                wager = input.nextInt();
                if (wager > bankBalance) {
                    System.out.println("Wager cannot exceed current bank balance. Try again.");
                }
            } while (wager > bankBalance);

            // Play one game of craps
            Status gameStatus;
            int myPoint = 0;
            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.println("Point is set to: " + myPoint);
                    break;
            }

            // Continue rolling if needed
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint)
                    gameStatus = Status.WON;
                else if (sumOfDice == 7)
                    gameStatus = Status.LOST;
            }

            // Determine outcome and update bank balance
            if (gameStatus == Status.WON) {
                bankBalance += wager;
                System.out.println("🎉 You win! New balance: $" + bankBalance);
            } else {
                bankBalance -= wager;
                System.out.println("💸 You lose. New balance: $" + bankBalance);

                if (bankBalance == 0) {
                    System.out.println("😢 Sorry. You busted!");
                    break;
                }
            }

            // Show a random “chatter” message
            chatter(rand);
        }

        input.close();
    }

    // Roll dice and return sum
    public static int rollDice() {
        Random rand = new Random();
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        int sum = die1 + die2;

        System.out.println("🎲 Rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    // Display random chatter message
    public static void chatter(Random rand) {
        String[] messages = {
            "💬 Oh, you're going for broke, huh?",
            "💬 Aw c'mon, take a chance!",
            "💬 You're up big. Now's the time to cash in your chips!",
            "💬 Don't get cold feet now!",
            "💬 Feeling lucky today?"
        };

        int index = rand.nextInt(messages.length);
        System.out.println(messages[index]);
    }
}
