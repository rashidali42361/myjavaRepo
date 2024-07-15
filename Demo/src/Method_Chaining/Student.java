package Method_Chaining;

public class Student {
	String name;
	int age;
	int rollNo;
	public static Student obj()
	{
		return new Student();
		
	}
	public Student setValue(String name,int age,int rollNo)
	{
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
		return this;
	}
	public void display()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student roll no is "+rollNo);
		System.out.println("========================================");
	}

}
