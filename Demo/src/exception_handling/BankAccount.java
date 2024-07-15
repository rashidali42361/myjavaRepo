package exception_handling;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first transection");
		double balance=sc.nextDouble();
		try
		{
			account(balance);
		}
		catch(LowBalanceException e)
		{
			System.out.println("you have low balance please mentain atleast 5000 in your account");
			System.out.println(e);
			e.printStackTrace();
		}
		

	}
	public static void account(double balance) throws LowBalanceException
	{
		if(balance>=5000)
		{
			System.out.println("Your account balance is "+balance);
		}
		else
		{
			throw new LowBalanceException();
		}
	}

}
