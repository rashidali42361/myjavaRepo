package recursion;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(1));

	}
	public static String test(int n)
	{
		if(n<=3)
		{
			System.out.println(n);
			return n+" "+ test(n+1);
		}
		else
		{
			return  "program end";
		}
	}

}
