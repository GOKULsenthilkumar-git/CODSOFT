import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    

        while (true) {
            int numbertoguess = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("Guess a number between 1 and 100.");

            while (attempts < 10) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numbertoguess) {
                    System.out.println("oops Too low! so Try again....");
                } else if (guess > numbertoguess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts == 10) {
                System.out.println("Sorry, you didn't guess the number. It was " + numbertoguess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }
}