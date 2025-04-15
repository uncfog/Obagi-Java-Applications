import java.util.Scanner;

public class GradeQuality {

    // Method that returns quality points based on average
    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100)
            return 4;
        else if (average >= 80)
            return 3;
        else if (average >= 70)
            return 2;
        else if (average >= 60)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for average
        System.out.print("Enter the student's average (0 - 100): ");
        int avg = input.nextInt();

        // Get quality points
        int points = qualityPoints(avg);

        // Display result
        System.out.println("Quality Points: " + points);

        input.close();
    }
}
