public class BankAccount
{
    private String owner;
    private int balance;
    public BankAccount(String owner)
    {
        this.owner=owner;
        balance=0;
        //this(owner,0);
    }
    public BankAccount(String owner,int balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        if(amount<=0)
        {
            System.out.println("invalid amount for deposit");
        }
        else
        {
            System.out.println("deposit amount is:"+amount);
            balance+=amount;
        }

    }
    public void withdraw(int amount)
    {
        if(balance>0) {
            if (amount <= 0&& amount>balance) {
                System.out.println("invalid amount for withdrawal");
            } else {
                System.out.println("withdrawal amount is:" + amount);
                balance -= amount;
            }
        }
        else
        {
            System.out.println("withdrawal not possible");
        }
    }
    public String getOwner()
    {
        return owner;
    }
    public int getBalance()
    {
        return balance;
    }
}
