package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(23);
		c1.add(45);
		c1.add(457);
		c1.add(128);
		c1.add(17);
		c1.add(679);
		c1.add(311);
		Collection c2=new ArrayList();
		for(Integer x:c1)
		{
			System.out.println(x);
			if(checkPrime(x))
			{
				c2.add(x);
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		
	}
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	}


