package supercall;

public class SavingAccount extends Bank {
	String cusName;
	int accountNo;
	double balance;
	SavingAccount()
	{
		
	}
	SavingAccount(String bname,String ifsc,int pin,String cusName,int accountNo,double balance)
	{
		super(bname,ifsc,pin);//super call statement is used to call the immediate parent class constructor in to child class.
		this.cusName=cusName;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void displayAcc()
	{
		super.displaybank();
		System.out.println("Customer name is "+cusName);
		System.out.println("Customer account number is "+accountNo);
		System.out.println("Balance in account "+balance);
		System.out.println("===========================================");
		
	}

}
