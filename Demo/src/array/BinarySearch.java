package array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90};//for this the array should be sorted.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search:");
		int n=sc.nextInt();
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==n)
			{
				System.out.println("true");
				flag=true;
				break;
			}
			if(n>a[mid])
			{
				l=mid+1;
			}
			if(n<a[mid])
			{
				h=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("false");
		}
		
		

	}

}
