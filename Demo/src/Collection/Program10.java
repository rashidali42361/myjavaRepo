package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program10 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(35);
		c2.add(64);
		Collection<Integer> c3=new ArrayList<Integer>();
		c3.add(65);
		c3.add(28);
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		Object [] p=c1.toArray();
		System.out.println(c1.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		



	}

}
