package array;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
	int[] a= {10,32,30,40,50,60};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index to delete the element:");
	int index=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(i==index)
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			break;
		}
		
	}
	for(int k=0;k<a.length-1;k++)
	{
		System.out.println(a[k]);
	}

	}

}
