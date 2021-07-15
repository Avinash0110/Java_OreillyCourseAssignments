import java.util.Scanner;

public class Proj2_2_MadLabsClone
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("enter the noun:");
        String noun=keyboard.next();
        System.out.print("enter the pronoun:");
        String pronoun=keyboard.next();
        System.out.print("enter the adjective:");
        String adjective=keyboard.next();
        System.out.print("enter the verb:");
        String verb=keyboard.next();
        System.out.println("It was a "+adjective+" , gray day but even the darkest of days can turn sunny. Depressed by the weather, " +noun+" put on "+pronoun+" warmest coat. He could not find his gloves so he "+verb+" his cold hands deep into the pockets of his coat.");
    }
}
