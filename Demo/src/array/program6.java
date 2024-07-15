package array;

import java.util.Scanner;

//write program to delete an element from the existing array at a specific index
public class program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length:");
		int size=sc.nextInt();
		int arr1[]= new int[size];
		for(int k=0;k<size;k++)
		{
			arr1[k]=sc.nextInt();
		}
		int arr2[]=new int[size-1];
		System.out.println("Enter the index to delete number:");
		int index=sc.nextInt();
		if(index>=0 || index<arr1.length)
		{
		for(int i=0;i<arr1.length-1;i++)
		{
			if(i==index)
			{
				arr2[i]=arr1[i+1];
			}
			else
			{
				arr2[i]=arr1[i];
			}
			System.out.println(arr2[i]);
		}
		}
		else
		{
			System.out.println("please enter the valid index");
		}
		
		

	}

}
