import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to guessingGame!");
        System.out.println("Please, select the difficult: ");
        System.out.println("1 - Easy (5 attempts, number to be guessed from 1 to 10)");
        System.out.println("2 - Medium (10 attempts, number to be guessed from 1 to 50)");
        System.out.println("3 - Hard (15 attempts, number to be guessed from 1 to 100)");

        int level = scanner.nextInt();
        int maxNumber;
        int maxAttempts;

        switch(level) {
            case 1:
                maxNumber = 10;
                maxAttempts = 5;
                break;
            case 2:
                maxNumber = 50;
                maxAttempts = 10;
                break;
            case 3:
                maxNumber = 100;
                maxAttempts = 15;
                break;
            default:
                System.out.println("Level invalid, the game is over");
                return;
        }
        int secretNumber = random.nextInt(maxNumber) + 1;

        System.out.println("You have selected " + level + ".");
        System.out.println("You must guess a number from 1 to " + maxNumber + ".");
        System.out.println("You have " + maxAttempts + " attempts.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt #" + attempt + ": ");
            int enteredNumber = scanner.nextInt();

            if (enteredNumber == secretNumber) {
                System.out.println("Congratulations!!; You guessed the number in " + attempt + " attempts!");
                return;
            } else {
                System.out.println("Incorrect number, Try again :(");
            }
        }
        System.out.println("Sorry, you have exhausted your attempts.");
        System.out.println("the secret number was: " + secretNumber);
    }
}