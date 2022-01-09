package AccessModifier;

public class PrivateVariableTest 
{
	public static void main(String args[])
	{
		PrivateMethod  n =new PrivateMethod();
		n.test1();  //public method can access outside
		 //n.test();  // private method can not access outside the class
		PrivateVariable  ob= new PrivateVariable();
		ob.a=100;    //default variable can access
		ob.b=890;    //public variable can access
		//ob.c=567;  //private variable can not access
		ob.setc(567);
		System.out.println("Default variable ="+ob.a+"\n"+"public variable =  "+ob.b);
	}

}
