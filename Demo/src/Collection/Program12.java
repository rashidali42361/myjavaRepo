package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program12 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(66);
		l1.add(34);
		l1.add(76);
		l1.add(78);
		System.out.println("==========access by for loop=========");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("Element at index "+i+" is "+l1.get(i));
		}

	}

}
