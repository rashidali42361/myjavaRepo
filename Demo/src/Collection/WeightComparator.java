package Collection;

import java.util.Comparator;

public class WeightComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2)
	{
		if(s1.weight>s2.weight)
		{
			return 1;
		}
		else if(s1.weight<s2.weight)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	
}
