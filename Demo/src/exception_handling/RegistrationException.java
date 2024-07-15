package exception_handling;

import java.util.Scanner;

public class RegistrationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();	
		try
		{
			checkEligibility(age);
		}
		catch(UnderAgeException e)
		{
			System.out.println("You are UnderAge");
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void checkEligibility(int age) throws UnderAgeException
	{
		if(age>=18)
		{
			System.out.println("you are eligible to register");
		}
		else
		{
			throw new UnderAgeException();
		}
	}
}


