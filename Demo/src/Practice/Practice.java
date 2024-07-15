package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int[] a= {10,20,30,32,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of element to delete the element :");
		int index = sc.nextInt();
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
