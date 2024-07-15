package Collection;

public class Student {
	String name;
	int age;
	double weight;
	Student()
	{
		
	}
	Student(String name,int age,double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	public String toString()
	{
		return "name is "+name+ "age is "+age+ "weight is "+weight;
	}
	

}
