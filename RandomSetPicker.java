import java.util.Random;

public class RandomSetPicker {

    public static void main(String[] args) {
        // Create a Random object for generating random numbers
        Random rand = new Random();

        // a) Set: {2, 4, 6, 8, 10}
        int[] setA = {2, 4, 6, 8, 10};
        int randomA = setA[rand.nextInt(setA.length)];
        System.out.println("Random number from {2, 4, 6, 8, 10}: " + randomA);

        // b) Set: {3, 5, 7, 9, 11}
        int[] setB = {3, 5, 7, 9, 11};
        int randomB = setB[rand.nextInt(setB.length)];
        System.out.println("Random number from {3, 5, 7, 9, 11}: " + randomB);

        // c) Set: {6, 10, 14, 18, 22}
        int[] setC = {6, 10, 14, 18, 22};
        int randomC = setC[rand.nextInt(setC.length)];
        System.out.println("Random number from {6, 10, 14, 18, 22}: " + randomC);
    }
}
