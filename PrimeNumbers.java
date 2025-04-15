public class PrimeNumbers {

    public static boolean isPrimeNaive(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void displayPrimesNaive(int limit) {
        System.out.println("Primes up to " + limit + " using n/2 method:");
        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrimeNaive(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes found: " + count);
    }

    public static void displayPrimesOptimized(int limit) {
        System.out.println("\nPrimes up to " + limit + " using sqrt(n) method:");
        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes found: " + count);
    }

    public static void main(String[] args) {
        int limit = 10000;

        long startTime1 = System.nanoTime();
        displayPrimesNaive(limit);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken (naive): " + (endTime1 - startTime1) / 1_000_000 + " ms");

        long startTime2 = System.nanoTime();
        displayPrimesOptimized(limit);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken (optimized): " + (endTime2 - startTime2) / 1_000_000 + " ms");
    }
}
