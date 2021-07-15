import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;

        boolean guessedNumber = false;
        while (!guessedNumber) {
            System.out.println("user guess is: ");
            int userGuess = scanner.nextInt();


            if (userGuess == randomNumber) {
                System.out.println("Congratulations!...you have guessed correct number");
                guessedNumber = true;

            } else if (randomNumber > userGuess) {
                System.out.println("your guess is too low");
            } else if (randomNumber < userGuess) {
                System.out.println("your guess is too high");
            } else {
                System.out.println("not in range");
            }

        }
    }
}
