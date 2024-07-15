package Collection;

import java.util.LinkedHashSet;

public class Program18 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(12);
		hs.add(77);
		hs.add(56);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(32);
		hs.add(66);
		hs.add(77);
		for(Integer x: hs)
		{
			System.out.println(x);
		}
		
		System.out.println(hs.contains(32));
		System.out.println(hs.contains(78));

	}

}
