import java.util.Scanner;

public class AverageOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1: ");
        double number1=scanner.nextDouble();
        System.out.println("enter number 2: ");
        double number2=scanner.nextDouble();
        System.out.println("enter number 3: ");
        double number3=scanner.nextDouble();
        double average=(number1+number2+number3)/3;
        System.out.println("average: "+average);

    }
}
