package OOPs;

public class MasterClass {

	public static void main(String[] args) 
	{
		Subclass a= new Subclass();
		a.getdata();
		a.putData();
		Area b= new Area();  // sub class object
		b.getData();  // get diameter from super class
		b.radius();  
		b.areaOfCircle();
		b.circumference();
	}

}
