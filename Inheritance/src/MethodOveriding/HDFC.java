package MethodOveriding;

public class HDFC extends Bank
{
	public void account()
	{
		System.out.println("This is HDFC account");
	}
	public void displayAmount()
	{
		int a=78;
		super.displayAmount();
		System.out.println("Amount = "+a);
	}
	public void displayName(String s)
	{
		super.displayName("Durva");  // Bank
		System.out.println("Name="+s);
	}

}
