package Collection;

import java.util.HashSet;

public class Program16 {

	public static void main(String[] args) {
		HashSet hm=new HashSet();
		hm.add(20);
		hm.add(30);
		hm.add(40);
		hm.add(79);
		hm.add(15);
		hm.add(23);
		hm.add(null);
		hm.add(null);
		hm.add(23);
		for(Object x:hm)
		{
			System.out.println(x);
		}
		System.out.println(hm.contains(45));
		System.out.println(hm.contains(23));

	}

}
