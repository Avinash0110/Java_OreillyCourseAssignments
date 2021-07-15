import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel
{
    public static void main(String args[])
    {
        ArrayList<String> namesList=new ArrayList<>();
        ArrayList<Integer> ageList=new ArrayList<>();
        Scanner keyboard=new Scanner(System.in);
        int peopleCount=5;

        for(int i=0;i<peopleCount;i++)
        {
            System.out.print("enter person "+(i+1)+" name:");
            namesList.add(keyboard.next());
            System.out.print("enter person "+(i+1)+" age:");
            ageList.add(keyboard.nextInt());
        }
        for(int i=0;i<peopleCount;i++)
        {
            System.out.println(namesList.get(i)+" is "+ageList.get(i)+" years old");
        }

    }
}
