public class CircleDemo
{
public static void main(String[] args)
{
    Circle circle1=new Circle();
    Circle circle2=new Circle(5.0);
    //no arg
    System.out.println("radius is:"+circle1.getRadius());
    System.out.println("Circumference is:"+circle1.circumference());
    System.out.println("area is:"+circle1.circumference());
    //arg
    System.out.println();
    System.out.println("radius is:"+circle2.getRadius());
    System.out.println("Circumference is:"+circle2.circumference());
    System.out.println("area is:"+circle2.circumference());

}
}
