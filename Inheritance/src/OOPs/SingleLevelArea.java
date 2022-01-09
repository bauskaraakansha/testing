//Program of Single level inheritance
package OOPs;

import java.util.Scanner;

public class SingleLevelArea  //Super class
{ 
	 int diameter;
	 int radius;
	public  void getData()
	{
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the diameter of circle");
		diameter=o.nextInt();
	}

	public  void radius()
	{
		radius=diameter/2;
		System.out.println("Radius of the circle is ="+radius);
	}

 
}
