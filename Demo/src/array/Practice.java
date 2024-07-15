package array;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//find frequency of number in an array.
		int [] a= {1,2,3,3,3,4,5,5,4,6,7,6,8};
		int temp []=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp[j]=-1;
					count++;
				}
				
			}
			if(temp[i]!=-1)
			{
				
			}
			
		}
		System.out.println("========================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}