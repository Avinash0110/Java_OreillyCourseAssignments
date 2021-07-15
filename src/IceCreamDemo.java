public class IceCreamDemo
{
    public static void main(String[] args)
    {
        IceCream iceCream1=new IceCream("vanilla",100,2);
        IceCream iceCream2=new IceCream("chocolate",80,3);
        //vanilla
        iceCream1.addTopping("oreos");
        iceCream1.addTopping("wasabi");
        iceCream1.addTopping("peanut");
        System.out.println("ice cream "+iceCream1.getName()+" of cost "+iceCream1.getCost()+" need "+
        iceCream1.getNumScoops()+" scoops with below toppings");
        iceCream1.printToppings();
        //chocolate
        iceCream2.addTopping("oreos");
        iceCream2.addTopping("wasabi");
        iceCream2.addTopping("peanut");
        System.out.println("ice cream "+iceCream2.getName()+" of cost "+iceCream2.getCost()+" need "+
                iceCream2.getNumScoops()+" scoops with below toppings");
        iceCream2.printToppings();

    }

}
