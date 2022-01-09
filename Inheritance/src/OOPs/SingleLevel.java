//Program for Single level inheritance
package OOPs;

import java.util.Scanner;

public class SingleLevel //super class
{
	String name;
	int account;
	long mob;
	public void getdata()
	{
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the name of employee");
		name=input.nextLine();
		
		System.out.println("Enter the Account Number of employee");
		account=input.nextInt();
		
		System.out.println("Enter the Mobile");
		mob=input.nextLong();
		
	}

}
