import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("random number is "+randomNumber);
        System.out.println("user guess is: ");
        int userGuess = scanner.nextInt();
        if (userGuess == randomNumber) {
            System.out.println("Congratulations!...you have guessed correct number");
        } else if (randomNumber > userGuess) {
            System.out.println("your guess is too low");
        } else if (randomNumber < userGuess) {
            System.out.println("your guess is too high");
        } else {jh
            System.out.println("not in range");
        }
    }
}
