package exception_handling;

public class Program9 {
	public static void main(String[]args)
	{
		System.out.println("Main starts");
		int a=12;
		int b=2;
		int[] c= {12, 30, 40, 50};
		try
		{
			System.out.println(a/b);
			System.out.println(c[5]);
		}
		catch(ArithmeticException | NullPointerException e )
		{
			System.out.println("ArithmeticException caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrray index is not found Exception caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Program ends");
	}

	}

