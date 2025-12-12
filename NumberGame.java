import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int attempts = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!\n");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.\n");
            }
            else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.\n");
            }
            else {
                System.out.println("\n Congratulations! You guessed the correct number!");
                System.out.println("The number was: " + numberToGuess);
                System.out.println("Attempts taken: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
