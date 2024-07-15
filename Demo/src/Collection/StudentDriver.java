package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student("Mohan", 23, 44.33);
		Student s2=new Student("Sohan", 22, 42.33);
		Student s3=new Student("John", 21, 63.33);
		Student s4=new Student("Hamilton",34,68.3);
		ArrayList a1=new ArrayList();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		System.out.println("Name sorting=================");
		/*Collections.sort(a1, new NameComparator());
		for(Object x:a1)
		{
			System.out.println(x);
		}
		System.out.println("Age sorting=================");
		Collections.sort(a1, new AgeComparator());*/
		for(Object x:a1)
		{
			System.out.println(x);
		}
		System.out.println("Weight sorting=================");
		Collections.sort(a1, new WeightComparator());
		for(Object x:a1)
		{
			System.out.println(x);
		}
		

	}

}
