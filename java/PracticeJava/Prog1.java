package PracticeJava;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the valid number:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The given number is an even number");
			if(n%8==0)
			{
				System.out.println("The number is even and also divided by 8");
			}
			else
			{
				System.out.println("The number is even but not divided by 8");
				
			}
		}
		else if(n%2!=0)
		{
			System.out.println("The given number is odd number");
			if(n%9==0)
			{
				System.out.println("Number is divided by 9");
			}
			else
			{
				System.out.println("the number is not divided by 92");
			}
		}
	
	

	}

}
