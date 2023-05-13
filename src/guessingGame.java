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


    }
}