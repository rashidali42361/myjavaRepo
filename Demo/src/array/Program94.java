package array;

import java.util.Arrays;

//write a program to find maximum element in an array.
public class Program94 {

	public static void main(String[] args) {
		int [] a= {10,20,20,-30,60,35,25};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
		}
		System.out.println("Array after sorting:"+Arrays.toString(a));
		System.out.println("The greatest number in array is  "+a[a.length-1]);
		System.out.println("The lowest number is "+a[0]);
		System.out.println("maximum element at even index:"+a[4]);
		System.out.println("maximum element at odd index:"+a[3]);



	}

}
