package object_class;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1=new Employ("Mohan", 446, 345466.43);
		Employ e2=new Employ("Sohan", 116, 999768.93);
		System.out.println("=========toString()============");
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println("==================");
		System.out.println(e2);
		System.out.println(e2.toString());
		
		Employ e3=new Employ("Mohan", 446, 345466.43);
		System.out.println(e3);
		System.out.println("=====equals()=================");
		//System.out.println(e1==e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e2));
		System.out.println("===========hashCode()=============");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("=================finalize()===========");
		e1=null;
		System.gc();
		e2=null;
		System.gc();
		
	     

	}

}
