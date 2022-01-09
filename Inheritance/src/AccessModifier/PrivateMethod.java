//Program For Private Public methods
package AccessModifier;

public class PrivateMethod 
{
	private static void test()
	{
		System.out.println("This is private method");
	}
	public static void test1()
	{
		System.out.println("This is public method");
	}
	public static void main(String args[]) 
	{
		PrivateMethod.test(); // static private method
		PrivateMethod.test1();
	}
}
