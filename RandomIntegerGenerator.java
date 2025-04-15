import java.util.Random;

public class RandomIntegerGenerator {

    public static void main(String[] args) {
        Random rand = new Random();
        int n;

        // a) 1 ≤ n ≤ 2
        n = rand.nextInt(2) + 1;
        System.out.println("a) Random int from 1 to 2: " + n);

        // b) 1 ≤ n ≤ 100
        n = rand.nextInt(100) + 1;
        System.out.println("b) Random int from 1 to 100: " + n);

        // c) 0 ≤ n ≤ 9
        n = rand.nextInt(10);
        System.out.println("c) Random int from 0 to 9: " + n);

        // d) 1000 ≤ n ≤ 1112
        n = rand.nextInt(113) + 1000;  // 1112 - 1000 + 1 = 113
        System.out.println("d) Random int from 1000 to 1112: " + n);

        // e) -1 ≤ n ≤ 1
        n = rand.nextInt(3) - 1;       // Range: 0 to 2 → shift to -1 to 1
        System.out.println("e) Random int from -1 to 1: " + n);

        // f) -3 ≤ n ≤ 11
        n = rand.nextInt(15) - 3;      // 11 - (-3) + 1 = 15
        System.out.println("f) Random int from -3 to 11: " + n);
    }
}
