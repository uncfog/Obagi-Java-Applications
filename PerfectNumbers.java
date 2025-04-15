public class PerfectNumbers {

    // Check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Sum all divisors of 'number' from 1 up to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Display perfect numbers and their factors
    public static void displayPerfectNumbers(int upperLimit) {
        System.out.println("Perfect numbers between 1 and " + upperLimit + ":");

        for (int number = 2; number <= upperLimit; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " = ");

                // Display the factors
                for (int i = 1; i <= number / 2; i++) {
                    if (number % i == 0) {
                        System.out.print(i);
                        if (i != number / 2 && (number % (i + 1) == 0)) {
                            System.out.print(" + ");
                        }
                    }
                }
                System.out.println(); // Move to the next line after printing factors
            }
        }
    }

    public static void main(String[] args) {
        // Display perfect numbers up to 1000
        displayPerfectNumbers(1000);

        // Challenge: display perfect numbers up to 10000 or more
        System.out.println("\nNow testing up to 10000 (this may take a moment)...");
        displayPerfectNumbers(10000);
    }
}
