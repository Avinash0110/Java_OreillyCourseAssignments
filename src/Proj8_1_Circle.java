import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_Circle
{
public static void main(String args[]) {

    ArrayList<Circle> circleList = new ArrayList<>();
    fillArrayList(circleList);
    printCircles(circleList);
}
    public static void fillArrayList(ArrayList<Circle> circleAl)
    {
        Scanner inputFile;
        try {
            double radius;
            Circle temp;
            inputFile = new Scanner(new File("circle_data.txt"));
            while (inputFile.hasNext()) {
                radius = inputFile.nextDouble();
                temp = new Circle(radius);
                circleAl.add(temp);

            }
            inputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

public static void printCircles(ArrayList<Circle> circleAl)
{
    PrintWriter pw;
    try
    {
        pw=new PrintWriter("circles_output.txt");
        for(Circle c:circleAl)
        {
            System.out.println("radius:"+c.getRadius());
            System.out.println("circumference:"+c.circumference());
            System.out.println("area:"+c.area());
            System.out.println();

            pw.println("radius:"+c.getRadius());
            pw.println("circumference:"+c.circumference());
            pw.println("area:"+c.area());
            pw.println();


        }
        pw.close();
    }
    catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
}

}
}
