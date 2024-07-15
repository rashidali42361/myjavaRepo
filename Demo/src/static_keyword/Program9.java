package static_keyword;

public class Program9 {
	static int a=12;
	static int b=test();
	static
	{
		System.out.println("static block:"+a+"  "+b);
		a=test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		System.out.println(a+"  "+b);

	}
	public static int test() {
		System.out.println("this is test mesthod:"+a+b);
		b=45;
		System.out.println(a+"  "+b);
		return a+20;
	}

}
