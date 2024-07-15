package array;

import java.util.Scanner;

//wap to sort an array with the help of insertion technique.
public class Sort {

	public static void main(String[] args) {
		int[] arr= {10,50,30,10,5,100};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
		}
		int p=0;
		for(int k=0;k<arr.length-1;k++)
		{
			if(arr[k]!=arr[k+1])
			{
				arr[p]=arr[k];
				p++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
