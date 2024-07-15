package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(56);
		l1.add(34);
		l1.add(1, 66);
		l1.add(1, 45);
		l1.add(34);
		l1.add(77);
		l1.add(2, 90);
		l1.add(3, 61);
		l1.add(3, 55);
		System.out.println(l1);
		System.out.println("Index is: "+l1.indexOf(61));
		System.out.println("Index is: "+l1.indexOf(90));
		System.out.println("Index is: "+l1.indexOf(120));
		System.out.println("Index is: "+l1.indexOf(140));
		System.out.println("Index of 34 is: "+l1.indexOf(34));
		System.out.println("Index of 34 as the last index is: "+l1.lastIndexOf(34));
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.get(4));

	}

}
