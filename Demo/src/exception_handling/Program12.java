package exception_handling;

public class Program12 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		System.out.println("Program ends");
		
	}


	}


