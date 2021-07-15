import java.util.Scanner;

public class Proj2_1_AverageOfThree
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number 1: ");
        double number1=scanner.nextDouble();
        System.out.print("enter number 2: ");
        double number2=scanner.nextDouble();
        System.out.print("enter number 3: ");
        double number3=scanner.nextDouble();
        double average=(number1+number2+number3)/3;
        System.out.print("average: "+average);

    }
}
