import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System .out.println("enter the number to check arm strong or not:");
		int n=sc.nextInt();
		System.out.println(findSum(n));
		if(findSum(n)==n)
		{
			System.out.println("it is an arm strong number");
		}
		else
		{
			System.out.println("it is not arm strong number");
		}

	}
	public static int findSum(int n)
	{
		int sum=0;
		int i=n;
		while(i>0)
		{
			int rem=i%10;
			int m=1;
			for(int j=0;j<findNumDigit(n);j++)
			{
				m=m*rem;
			}
			i=i/10;
			sum=sum+m;			
		}
		return sum;
	}
	public static int findNumDigit(int n)
	{
		int count=0;
		for(int i=n;i>0;i=i/10)
		{
			count++;
		}
		return count;
	}


}
