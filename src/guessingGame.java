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
        int maxAttemps;

        switch(level) {
            case 1:
                maxNumber = 10;
                maxAttemps = 5;
                break;
            case 2:
                maxNumber = 50;
                maxAttemps = 10;
                break;
            case 3:
                maxNumber = 100;
                maxAttemps = 15;
                break;
            default:
                System.out.println("Level invalid, the game is over");
                return;
        }
        int secretNumber = random.nextInt(maxNumber) + 1;

        System.out.println("You have selected " + level + ".");
        System.out.println("You must guess a number from 1 to " + maxNumber + ".");
        System.out.println("You have " + maxAttemps + " attempts.");



    }
}