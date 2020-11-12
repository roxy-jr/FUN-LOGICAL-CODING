import java.util.*;
class Account
{
	private int bal;
	public account(int bal)
	{
		this.bal=bal;
	}
	public boolean isSufficientBalance(int w)
	{
		if(bal>w)
			return(true)
		else return(false);
	}public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("withdrawlmoney="+amt);
		System.out.println("your current balance is="+bal);
	}
}
class customer implements Runnable
{
	private String name;
	private shell;
	public customer(shell)
	{this.shell=shell
	name=n;}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(name+"enter amount to withdrawn");
		int amt=sc.nextInt();
		if(account.isSufficientBalance(amt))
		{
			System.out.println(name);
			account.withdraw(amt)
		}
		elseSystem.out.println("inssuficient balance");
	}
}
public class threadExample
{
	public static void main(String []ar)
	{
		Account a1=new Account(1000);
		customer c1=new customer(a1,aditya),c2=new customer(a1,sarika);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}
	
