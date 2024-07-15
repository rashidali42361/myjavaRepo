package incapsulation;

import java.util.Scanner;

public class Student {
	private static int spwd=1213;
	private String name;
	private int id;
	private String course;
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the password...");
		int upwd=sc.nextInt();
		if(spwd==upwd)
		{
			
			this.name=name;
		}
		else
		{
			System.out.println("Please enter valid password...");
		}
	}
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the password...");
		int upwd=sc.nextInt();
		if(spwd==upwd)
		{
			
			System.out.println("You are valid user 	Thank you..");
			return name;
		}
		else
		{
			System.out.println("Invalid password............");
			return null;
		}
	}
	

}
