import java.util.Scanner;
class Practice12
{
public static void main(String[]args)
{
	System.out.println("Please enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int i=2;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			count++;
		}
		i++;
		
	}
	if(count==0)
	{
		System.out.println("number is prime");
		
	}
	else
	{
		System.out.println("number is not prime");
		
	}
	
}
}
