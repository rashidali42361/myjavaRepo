package PracticeOops;

public class MethodOverLoading {
	String name;
	int id;
	double salary;
	public void test(String name)
	{
		this.name=name;
	}
	public void test(String name,int id )
	{
		this.name=name;
		this.id=id;
		
	}
	public void test(String name,int id,double salary)
	
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name of employ is "+name);
		System.out.println("Id of employ is "+id);
		System.out.println("Salary of employ is "+salary);
	}
	public static void main(String[]args)
	{
		MethodOverLoading e=new MethodOverLoading();
		e.test("mitchel",112);
		e.display();
	}

}
