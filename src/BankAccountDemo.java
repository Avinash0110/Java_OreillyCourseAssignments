public class BankAccountDemo
{
    public static void main(String args[])
    {
        BankAccount owner1 = new BankAccount("avinash");
        BankAccount owner2 = new BankAccount("sai", 100000);
        //owner1
        System.out.println("owner 1 details....\nowner name: "+owner1.getOwner());
        owner1.deposit(-1);
        owner1.withdraw(500);
        System.out.println("balance :"+owner1.getBalance());
        System.out.println();
        //owner2
        System.out.println("owner 2 details....\nowner name: "+owner2.getOwner());
        owner2.deposit(-89);
        owner2.withdraw(700);
        System.out.println("balance :"+owner2.getBalance());
    }
}
