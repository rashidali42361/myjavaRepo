package Practice;

public class Student {
	
	String name;
	double age;
	int roll_no;
	public  static Student obj()
	{
		return new Student();
	}
	public Student setValue(String name,double age,int roll_no)
	{
		this.name=name;
		this.age=age;
		this.roll_no=roll_no;
		return this;
	}
	public void display()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student roll number is "+roll_no);
	}
	

	
}
