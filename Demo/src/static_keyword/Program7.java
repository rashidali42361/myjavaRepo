package static_keyword;

public class Program7 {
	static int a=12;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		System.out.println(a+" "+b);
		test();

	}
	public static void test() {
		System.out.println("Test method:"+a+"  "+b);
		a=120;
		int b=16;
		System.out.println(a+" "+b);
	}

}
