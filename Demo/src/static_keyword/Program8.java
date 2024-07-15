package static_keyword;

public class Program8 {
	static int a=12;
	static int b=test();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		System.out.println(a+" "+b+" "+c);
		test();
		System.out.println(a+" "+b);

	}
	public static int test()
	{
		System.out.println("Test method :"+a+" "+b+" "+c);
		int a=20;
		int b=36;
		System.out.println(a+" "+b);
		return a+100;
	}
     static int c=34;

}
