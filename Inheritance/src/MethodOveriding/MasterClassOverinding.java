package MethodOveriding;

public class MasterClassOverinding 
{
	public static void main(String args[])
	{
		HDFC h=new HDFC();
		h.account();
		h.displayAmount();
		h.displayName("HDFC");
		h.rules();  // bank
		
		SBI s=new SBI();
		s.withdraw();
		//s.displayAmount(1000);
		s.displayName("Isha");
		s.rules(); //bank
		
	}
}
