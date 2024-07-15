package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program4 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		Collection c2=new ArrayList();
		c2.add(30);
		c2.add(40);
		Collection c3=new ArrayList();
		c3.add(50);
		c3.add(60);
		Collection c4=new ArrayList();
		c4.add(70);
		c4.add(80);
		Collection c5=new ArrayList();
		c5.addAll(c1);
		c5.addAll(c2);
		c5.addAll(c3);
		c5.addAll(c4);
		System.out.println(c5);
		System.out.println(c5.containsAll(c1));
		System.out.println(c5.removeAll(c2));
		System.out.println(c5);
		System.out.println(c5.retainAll(c4));
		System.out.println(c5);
		c5.clear();
		System.out.println(c5);

	}

}
