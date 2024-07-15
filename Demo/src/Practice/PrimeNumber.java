package Practice;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=n/2;i>0;i--)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println( n+" is a prime number");
		}
		else
		{
			System.out.println("The given number is not prime number");
		}

	}
	

}
