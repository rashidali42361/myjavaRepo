package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add(13);
		c1.add(14);
		c1.add(65);
		c1.add(111);
		c1.add(114);
		c1.add(76);
		c1.add(23);
		Collection c2=new ArrayList();
		for(Object x:c1)
		{
			if(checkPrime((Integer)x))
			{
				c2.add(x);
			}
		}
		System.out.println(c1);
		System.out.println(c2);

	}
	public static boolean checkPrime(int num)
	{
		int count=0;
		for(int i=1;i<num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
