import java.util.Scanner;

public class Proj3_1_LearningPackages
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the package:");
        int packageNumber=scanner.nextInt();
        System.out.println("enter the no.of courses:");
        int totalCourses=scanner.nextInt();
        double totalCost=0;
        switch(packageNumber)
        {
            case 1:
                if(totalCourses>2)
                {
                    totalCost=10+(6*(totalCourses-2));
                }
                else
                {
                    totalCost=10;
                }
                System.out.println("total cost per month:"+totalCost);
                break;
            case 2:
                if(totalCourses>4)
                {
                    totalCost=12+(4*(totalCourses-4));
                }
                else
                {
                    totalCost=12;
                }
                System.out.println("total cost per month:"+totalCost);
                break;
            case 3:
                if(totalCourses>6)
                {
                    totalCost=15+(3*(totalCourses-6));
                }
                else
                {
                 totalCost=15;
                }
                System.out.println("total cost per month:"+totalCost);
                break;
            default:
                System.out.println("enter valid package...");

        }

    }
}
