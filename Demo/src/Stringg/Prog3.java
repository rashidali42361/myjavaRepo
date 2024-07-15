package Stringg;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// write a java program to swap to variable by using third veriable.
		int x;
		int y;
		//int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y value:");
		x=sc.nextInt();
		y=sc.nextInt();
		//before swaping
		System.out.println("Before swaping :"+x+""+y);
	
		x=y;
		y=x;
		System.out.println("After swaping :"+x+""+y);
		

	}

}
