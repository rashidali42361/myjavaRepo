package exception_handling;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		int a=12;
		int b=0;
		int[] c= {12, 30, 40, 50};
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught");
			System.out.println(e);
			System.out.println("==========================");
			e.printStackTrace();
			System.out.println("==========================");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		try
		{
			System.out.println(c[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrray index is not found Exception caught");
			System.out.println(e);
			System.out.println("==========================");
			e.printStackTrace();
			System.out.println("==========================");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Program ends");
	}

	}


