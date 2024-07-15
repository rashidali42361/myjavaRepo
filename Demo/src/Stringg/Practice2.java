package Stringg;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write the string to test....");
		String s1=sc.nextLine();
		palindromString(s1);

	}
	public static void palindromString(String s1)
	{
		//String s1="I am happy";
		String s2="";
		char[] arr=s1.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			s2=s2+arr[i];
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

}
