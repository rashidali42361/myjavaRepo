package PracticeJava;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// write a program to check the given number is perfect  number or not.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
				System.out.println("sum :"+sum);
				
			}
		}
		if(sum==n)
		{
			System.out.println("The given number is perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
		
	}

}
