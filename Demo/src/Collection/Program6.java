package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program6 {
	public static void main(String[]args) {
	Collection c1=new ArrayList();
	c1.add(23);
	c1.add(45);
	c1.add("Mohan");
	c1.add(45.7);
	c1.add(45);
	c1.add(457);
	c1.add(45);
	c1.add(679);
	c1.add(60);
	System.out.println(c1);
	System.out.println("=========Iterate one by one=========");
	for(Object x:c1)
	{
		System.out.println(x);
	}

}}

