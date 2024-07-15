package Collection;

import java.util.LinkedHashMap;

public class Program21 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		hm.put(23, "mohan");
		hm.put(13, "sohan");
		hm.put(33, "rohan");
		hm.put(43, "manmohan");
		hm.put(33, "jagmohan");
		System.out.println(hm);
	}

}
