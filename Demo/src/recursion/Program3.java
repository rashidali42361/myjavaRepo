package recursion;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value:");
		int n=sc.nextInt();
		System.out.println("The sum is ="+test(n));

	}
	public static int test(int n)
	{
		if(n>1)
		{
			return n+test(n-1);
		}
		else
		{
			return 1;
		}
	}

}
