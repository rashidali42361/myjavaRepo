package exception_handling;

public class Program13 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2400);
			}
			catch(Exception e)
			{
				System.out.println("Exception caught");
			}
		}
		

	}

}
