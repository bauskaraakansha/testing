package TypeCasting;

public class DownCasting 
{
	public static void main(String args[]) 
	{
		Parent p = new Child(); //UpCasting
		p.name="Velocity";
		p.payment();   // Overriden method
		//p.id=1234; //can not accessible 
		
		//Child c = new Parent();   //try to DownCasting implicitly
		
		Child k =(Child) p;  //DownCasting explicitly
		k.id=1452;
		System.out.println(k.id);
		k.payment();
		
	}

}
