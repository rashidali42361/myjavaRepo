package PracticeJava;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the valid input: ");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
		{
			System.out.println("case 1 executed");
			break;
		}
		case 2:
		{
			System.out.println("case 2 executed");
			break;
		}
		case 3:
		{
			System.out.println("case 3 executed");
			break;
		}
		default:
		{
			System.out.println("Default case executed");
		}
		}

	}

}
