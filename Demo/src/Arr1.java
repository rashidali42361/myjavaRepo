import java.util.Scanner;
public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax:data type array name[]=new data type[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenth of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
		a[0]=sc.nextInt();
		System.out.println("enter the array element");
		a[1]=sc.nextInt();
		System.out.println("enter the array element");
		a[2]=sc.nextInt();
		System.out.println("enter the array element");
		a[3]=sc.nextInt();
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
