package PracticeJava;

import java.util.Scanner;

public class PP {
	public static void main(String[]args)
	{
		int x;
		int y;
		int temp;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		//before swaping
		System.out.println("Before swaping"+x+""+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swaping"+x+""+y);
		

	}

}
