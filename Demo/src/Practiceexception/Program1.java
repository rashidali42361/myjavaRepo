package Practiceexception;

public class Program1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/2);
		}
		catch(Exception e)
		{
			System.out.println("Exception caugth.....");
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is finnally block...");
			
		}
	}

}
