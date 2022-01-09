package TypeCasting;

public class ExampleImplicit 
{
	public static void main (String args[])
	{
		int a=10;
		double d;
		d=a;
		System.out.println(d);//implicit casting
		
		double b=10.6;
		int s=(int)b;
		System.out.println(s);//Explicit casting
		
	}

}
