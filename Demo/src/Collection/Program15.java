package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Mohan");
		l1.add("3454");
		l1.add(null);
		l1.add(null);
		l1.add(3, "jack");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("==========================");
		ArrayList a2=new ArrayList(l1);
		System.out.println(a2);

	}

}
