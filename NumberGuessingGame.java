import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int totalRounds = 0;
        int totalAttempts = 0;
        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("=================================");

        while (playAgain) {
            totalRounds++;

            int min = 1;
            int max = 100;
            int maxAttempts = 7;

            Random random = new Random();
            int secretNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + totalRounds);
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();

                if (guess < min || guess > max) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too High!");
                } else if (guess < secretNumber) {
                    System.out.println("Too Low!");
                } else {
                    guessedCorrectly = true;
                    totalAttempts += attempts;
                    System.out.println("Correct! You guessed the number in " + attempts + " attempt(s).");
                    break;
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("You Lost! The correct number was " + secretNumber + ".");
                totalAttempts += attempts;
            }

            System.out.print("\nPlay Again? (yes/no): ");
            String answer = scanner.next().trim().toLowerCase();
            playAgain = answer.equals("yes") || answer.equals("y");
        }

        System.out.println("\n=================================");
        System.out.println("           GAME SUMMARY");
        System.out.println("=================================");
        System.out.println("Rounds played: " + totalRounds);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
