import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Select the type of problems: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Random Mix");
        int problemType = input.nextInt();
        
        while (true) {
            generateQuestion(input, problemType);
        }
    }

    public static void generateQuestion(Scanner input, int problemType) {
        int num1 = 1 + randomNumbers.nextInt(9);
        int num2 = 1 + randomNumbers.nextInt(9);
        int correctAnswer = 0;
        
        // Based on problem type, generate the corresponding arithmetic question
        switch (problemType) {
            case 1: // Addition
                System.out.printf("How much is %d plus %d? ", num1, num2);
                correctAnswer = num1 + num2;
                break;
            case 2: // Subtraction
                System.out.printf("How much is %d minus %d? ", num1, num2);
                correctAnswer = num1 - num2;
                break;
            case 3: // Multiplication
                System.out.printf("How much is %d times %d? ", num1, num2);
                correctAnswer = num1 * num2;
                break;
            case 4: // Division
                System.out.printf("How much is %d divided by %d? ", num1, num2);
                correctAnswer = num1 / num2;
                break;
            case 5: // Random Mix
                int operation = randomNumbers.nextInt(4);
                switch (operation) {
                    case 0: // Addition
                        System.out.printf("How much is %d plus %d? ", num1, num2);
                        correctAnswer = num1 + num2;
                        break;
                    case 1: // Subtraction
                        System.out.printf("How much is %d minus %d? ", num1, num2);
                        correctAnswer = num1 - num2;
                        break;
                    case 2: // Multiplication
                        System.out.printf("How much is %d times %d? ", num1, num2);
                        correctAnswer = num1 * num2;
                        break;
                    case 3: // Division
                        System.out.printf("How much is %d divided by %d? ", num1, num2);
                        correctAnswer = num1 / num2;
                        break;
                }
                break;
        }
        
        // Get student's answer and check it
        int studentAnswer = input.nextInt();
        
        while (studentAnswer != correctAnswer) {
            giveRandomIncorrectResponse();
            studentAnswer = input.nextInt();
        }
        
        giveRandomCorrectResponse();
    }

    public static void giveRandomCorrectResponse() {
        int responseIndex = 1 + randomNumbers.nextInt(4);
        
        switch (responseIndex) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }

    public static void giveRandomIncorrectResponse() {
        int responseIndex = 1 + randomNumbers.nextInt(4);
        
        switch (responseIndex) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }
}
