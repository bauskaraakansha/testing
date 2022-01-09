//  program for Method Overrinding
package MethodOveriding;

public class Bank 
{
	int a=2345;//global
	
	public void rules()  
	{
		System.out.println("This is Rules");
	}
	public void displayAmount()
	{
		int a=80;
		System.out.println(this.a);
		System.out.println("Amount= "+a);
	}
	public void displayName(String s)
	{
		System.out.println("Name= "+s);
	}

}
