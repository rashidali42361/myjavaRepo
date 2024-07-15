package Constructor;

public class Student {
	String name;
	int rollno;
	int age;
	String address;
	Student()
	{
		System.out.println("Student object created");
	}
	Student(String name)
	{
		this();
		this.name=name;
	}
	Student(String name,int rollno)
	{
		this(name);
		this.rollno=rollno;
	}
	Student(String name,int rollno,int age)
	{
		this(name,rollno);
		this.age=age;
	}
	Student(String name,int rollno,int age,String address)
	{
		this(name,rollno,age);
		this.address=address;
	}
	Student(Student p)
	{
		this.name=p.name;
		this.rollno=p.rollno;
		this.age=p.age;
		this.address=p.address;
	}
	Student(Student p,String address)
	{
		this(p);
		this.address=address;
	}
	public void display()
	{
		System.out.println("The name is:"+name);
		System.out.println("The rollno is:"+rollno);
		System.out.println("The age is:"+age);
		System.out.println("The address is:"+address);
	}

}
