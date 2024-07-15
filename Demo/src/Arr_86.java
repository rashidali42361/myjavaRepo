import java.util.Scanner;
public class Arr_86 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length:");
		int n=sc.nextInt();
		test(n);

	}
	public static void test(int n)
	{
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("value at index "+i);
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		
	}

}
