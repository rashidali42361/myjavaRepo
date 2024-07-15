package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program3 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(45);
		c1.add("Mohan");
		c1.add(45.7);
		c1.add(679);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.add(77);
		c2.add(88);
		c2.add(c1);
		System.out.println(c2);
		System.out.println(c1.contains(20));
		System.out.println(c1.contains(45));
		System.out.println("=========================");
		System.out.println(c1.containsAll(c2));
		System.out.println(c2.containsAll(c1));
		System.out.println("==============================");
		System.out.println(c1.remove(45));
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
	
		
		
		
	}

}
