package MethodOveriding;

public class SBI extends Bank
{
	public void withdraw()
	{
		System.out.println("Withdraw from SBI");
	}
	public void displayAmount(int a)
	{
		super.displayAmount(1000);
		System.out.println("Amount="+a);
	}
	public void displayName(String s)
	{
		super.displayName("Aakansha");
		System.out.println("Name="+s);
	}


}
