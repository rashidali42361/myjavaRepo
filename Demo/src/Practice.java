import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(sum);
		for(int i=0;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		
}
	
}
	