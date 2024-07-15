import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();
		int sum=0;
		int k=n;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>0;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(k==sum)
		{
			System.out.println("The number is a strong number");
		}
		else
		{
			System.out.println("The number is a not Strong number");
		}
	

	}

}
