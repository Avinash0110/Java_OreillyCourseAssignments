import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists
{
    public static void main(String args[])
    {
        ArrayList<Double> realNumbersArrayList=new ArrayList<>();
        Scanner keyboard =new Scanner(System.in);
        System.out.println("enter real number:");
        while(true)
        {
            double realNumber=keyboard.nextDouble();

            if(realNumber<0)
            {
                break;
            }
            realNumbersArrayList.add(realNumber);

        }
        System.out.println("array list order:");
        for(double e:realNumbersArrayList)
        {
            System.out.println(e);
        }
        System.out.println("reverse order of arraylist");
        int size=realNumbersArrayList.size();
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(realNumbersArrayList.get(i));
        }
    }
}




