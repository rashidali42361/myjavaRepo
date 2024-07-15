package array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int [] a= {10,12,14,34,55,65,77,23};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to search:");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("true");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("false");
		}
		

	}

}
