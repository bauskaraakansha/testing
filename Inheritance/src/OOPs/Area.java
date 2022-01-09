package OOPs;

public class Area extends SingleLevelArea  // subclass area
{
	double circumference;
	double area;
	
	public void areaOfCircle()
	{
		area=Math.PI*(radius*radius);  
		System.out.println("Area of Circle is = "+area);
	}
	public void circumference()
	{
		circumference=2*Math.PI*radius;
		System.out.println("Circumference of circle is = "+circumference);
	}
}
