package Practice;

public class Program5 {

	public static void main(String[] args) {
		int countPrime=0;
		for(int n=1;n<50;n++)
		{
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
				System.out.println(n);
				countPrime++;
			}
		}
		System.out.println("The total prime number is "+countPrime);
	
	}

}
