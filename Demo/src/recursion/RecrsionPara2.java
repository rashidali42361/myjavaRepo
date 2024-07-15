package recursion;
import java.util.Scanner;
public class RecrsionPara2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		System.out.println("the LCM is: "+ lcm1(a,lcm1(b,c)));

	}
	public static int lcm1(int a,int b)
	{
		int big=a>b?a:b;
		int i;
		for(i=big; ;i=i+big)
		{
			if(i%a==0 && i%b==0)
			{
				break;
			}
			//count++;
		}
		return i;
	}

}
