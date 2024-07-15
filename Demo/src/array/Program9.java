package array;

import java.util.Scanner;

//write a programme to store and display ten decimal value.
public class Program9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=sc.nextInt();
		double[] arr=new double[l];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the value for index:"+i);
			double n=sc.nextDouble();
			arr[i]=n;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		

	}

}
