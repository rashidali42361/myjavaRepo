package supercall;

public class Bank {
	String bname;
	String ifsc;
	int pin;
	Bank()
	{
		
	}
	Bank(String bname,String ifsc,int pin)
	{
		this.bname=bname;
		this.ifsc=ifsc;
		this.pin=pin;
	}
	public  void displaybank()
	{
		System.out.println("Name of the bank is "+bname);
		System.out.println("Bank ifsc code is "+ifsc);
		System.out.println("Bank pin is "+pin);
		
	}

	

}
