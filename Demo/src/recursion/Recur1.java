package recursion;

public class Recur1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10);
		System.out.println("***Program end*****");
		

	}
	public static void test(int n)
	{
		if(n>0)
		{
		//System.out.println(n);
		test(n-1);
		System.out.println(n);
		}
	}

}
