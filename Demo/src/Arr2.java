import java.util.Scanner;
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(ar[j]);
		}

	}

}
