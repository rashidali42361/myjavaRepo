package array;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter array element:");
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		//int a1[]=new int[a1.length];
		
		/*for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.println(a[i]);			
		}*/
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[a.length-1-i];
			System.out.println(a[i]);
		}
		

	}

}
