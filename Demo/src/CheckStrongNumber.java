import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
			int n=sc.nextInt();
		int i=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int j=rem;j>0;j--)
			{
				fact=j*fact;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==i)
		{
			System.out.println("The number is strong "+i);
		}
		else
		{
			System.out.println("The number is not strong "+i);
		}

	}

}
