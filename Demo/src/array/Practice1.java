package array;

import java.util.ArrayList;
import java.util.Collection;

public class Practice1 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList();
		System.out.println("Parameterized collection before add element");
		System.out.println(c1);
		System.out.println("Collection after adding element");
		System.out.println(c1.add(123));
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		Object arr[]=c1.toArray();
		
		
		
		
	}

}
