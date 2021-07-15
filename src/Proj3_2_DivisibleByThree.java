import java.util.Scanner;

public class Proj3_2_DivisibleByThree
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer:");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number+" Divisible by 3..");
        } else {
            System.out.println(number+" Not divisible by 3..");
        }
    }
}
