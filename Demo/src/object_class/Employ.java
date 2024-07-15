package object_class;

public class Employ {
	String name;
	int empid;
	double salary;
	Employ()
	{
		
	}
	Employ(String name,int empid,double salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	public String toString()
	{
		return "[Name of employ is "+name+" Empid :"+empid+" Salary:"+salary+"]";
	}
	public boolean equals(Object o)
	{
		Employ e=(Employ)o;
		return this.name.equals(e.name) && this.empid==e.empid && this.salary==e.salary;
	}
	public int hashCode()
	{
		return empid;
	}
	public void finalize()
	{
		System.out.println("detach the following connections");
		System.out.println("System connection");
		System.out.println("Database connection");
		System.out.println("Network connection");
		System.out.println("=====================");
	}

}



	


