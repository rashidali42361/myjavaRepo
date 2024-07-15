package recursion;

public class Recur2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10);

	}
	
	public static void test(int n)
	{
		if(n>0)
		{
		test(n-1);
		System.out.println(n);
		}
	
		
		//return
		
	}

}
