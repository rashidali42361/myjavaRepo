package static_keyword;

public class Program4 {
    static int a=24;//global

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		a=30;//global
		System.out.println(a);
		int a=45;//local
		System.out.println(a);
		a=60;//local
		System.out.println(a);//local
		System.out.println(Program4.a);//global
		Program4.a=120;//global
		System.out.println(Program4.a);//global
		

	}

}
