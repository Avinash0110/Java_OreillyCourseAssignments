import java.util.Scanner;

public class Proj4_1_Arrays
{
    public static void main(String args[])
    {
        int size=5,i=0;
        int[] integerArray=new int[size];
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter integerArray elements:");
        for(i=0;i<size;i++)
        {
            integerArray[i]=keyboard.nextInt();
            integerArray[i]*=2;
        }
        System.out.println("array after multiplying with 2: ");
        for(int e:integerArray)
        {
            System.out.println(e);
        }

    }
}
