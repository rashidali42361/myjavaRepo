package object_class;

public class Program1 {
	public static void main(String[] args) {
		String s1=new String("Mohan");
		String s2=new String("Mohan");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("===================");
		Object x=12;
		
		Integer y=(Integer)x;
		System.out.println(y+100);
		
		Program1 p1=new Program1();
		System.out.println(p1);
		
	}


		
	}


