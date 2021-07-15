import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations
{
    public static void main(String args[])
    {
        ArrayList<String> firstNames=new ArrayList<>();
        ArrayList<String> lastNames=new ArrayList<>();
        Scanner keyboard =new Scanner(System.in);
        int countOfNames=5,spaceIndex;
        String fullName,firstname,lastname;
        for(int i=0;i<countOfNames;i++)
        {
            System.out.print("enter full name "+(i+1)+" :");
            fullName=keyboard.nextLine();
            spaceIndex=fullName.indexOf(" ");
            firstname=fullName.substring(0,spaceIndex);
            lastname=fullName.substring(spaceIndex+1);
            firstNames.add(firstname);
            lastNames.add(lastname);

        }
        for(int i=0;i<countOfNames;i++)
        {
            for(int j=0;j<countOfNames;j++)
            {
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }
    }
}
