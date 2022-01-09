//Program for Explicit casting
package TypeCasting;

public class ExplicitCasting {

	public static void main(String[] args) 
	{
		byte b=(byte)130;
		int k=(int)12.30;
		float f;
		byte d;
		int i =257;
		double h=233.212;
		System.out.println("conversion of int to byte= ");
		d=(byte)i;
		System.out.println("d  and  i = "+i+"  "+d);
		System.out.println("conversion of double to int= ");
		i=(int)h;
		System.out.println("i  and  h = "+h+"  "+i);
		System.out.println("conversion of double to byte= ");
		d=(byte)h;
		System.out.println("d  and  h = "+h+"  "+d);
		System.out.println("conversion of int to byte= "); 
		d=(byte)i;
		System.out.println("d  and  i = "+i+"  "+d);
		System.out.println("conversion of float to int= "+i);
		f=(int)k;
		System.out.println("d  and  h = "+k+"  "+f);
	}

}
