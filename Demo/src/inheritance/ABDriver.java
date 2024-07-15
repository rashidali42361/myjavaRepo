package inheritance;

public class ABDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		C c1=new C();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.p);
		System.out.println(b1.q);
		System.out.println("=============Multilevel Inheritence===============");
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.p);
		System.out.println(c1.q);
		System.out.println(c1.m);
		System.out.println(c1.n);
	
		
		b1.demo();

	}

}
