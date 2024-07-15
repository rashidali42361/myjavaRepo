/*54.DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD 
CALCULATE SQUARE OF RETURNING RESULT.*/
import java.util.Scanner;
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println(findSum(n)*findSum(n));

	}
	public static int findSum(int n)
	{
		int sum=0;
		int count=0;
		for(int i=n;i>0;i=i/10)
		{
			int rem=i%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			count++;
		}
		System.out.println(count);
		return sum;
	}

}
