package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(45);
		c1.add(65);
		System.out.println(c1);
		int sum=0;
		for(Object x:c1)
		{
			sum=sum+(Integer)x;
		}
		System.out.println("The sum is:"+sum);
		
		
	

	}

}
