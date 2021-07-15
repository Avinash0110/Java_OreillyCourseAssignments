import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Proj6_1_SumOfElements
{

    public static void main(String args[])
    {
        Scanner keyboard =new Scanner(System.in);
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        Random rand=new Random();
        System.out.print("enter the arraylist size:");
        int sizeOfList=keyboard.nextInt();
        for(int i=0;i<sizeOfList;i++)
        {
            integerArrayList.add(rand.nextInt(100));
        }
        int result=sumElements(integerArrayList);
        System.out.println("The sum of arraylist elements is:"+result);

    }
    public static int sumElements(ArrayList<Integer> integerArrayList)
    {
        int size=integerArrayList.size(),sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=integerArrayList.get(i);
        }
        return sum;
    }
}
