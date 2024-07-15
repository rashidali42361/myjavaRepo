package recursion;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(demo(10));

	}
	public static String demo(int n)
	{
		if(n>0)
		{
			return n+ " "+ demo(n-1);
		}
		else
		{
			return " ";
		}
		
	}
}
