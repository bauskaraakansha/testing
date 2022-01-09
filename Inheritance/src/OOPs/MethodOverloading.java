//Program for Method Overloading
package OOPs;

public class MethodOverloading {

	public void test() // same method name
	{
		System.out.println("This is non argument method");
	}
	public void test(int a)  //one argument
	{
		System.out.println("Enter the value of a="+a);
	}
	public void test(String add,long mob)
	{
		System.out.println("Print address and Mobile="+add+"  "+mob);
	}
	public static void main(String[] args) 
	{
		MethodOverloading  m= new MethodOverloading();
		m.test();
		m.test(100);
		m.test("Pune",7798173437l);
		//m.test(101);
		//m.test("goa",9890832688l);
	}

}
