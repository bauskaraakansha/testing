package OOPs;

public class HirarchicalMaster 
{
	public static void main (String args[])
	{
		HDFC h=new HDFC();
		h.mainMethod();
		h.hdfcMethod();
		
		SBI s=new SBI();
		s.mainMethod();
		s.sbiMethod();
		
		Axis a= new Axis();
		a.AxisMethod();
		a.mainMethod();
	}

}
