package Constructor;

import javax.swing.Spring;

public class Employ {
	String name;
	int id;
	double salary;
	String company;
	Employ()
	{
		
	}
	Employ(String name)
	{
		this();
		this.name=name;
		
	}
	Employ(String name,int id)
	{
		this(name);
		this.id=id;
	}
	Employ(String name,int id,double salary)
	{
		this(name,id);
		this.salary=salary;
	}
	Employ(String name,int id,double salary,String company)
	{
		this(name,id,salary);
		this.company=company;
	}
	Employ(Employ p)
	{
		this.name=p.name;
		this.id=p.id;
		this.salary=p.salary;
		this.company=p.company;
	}
	Employ(Employ p,double salary)
	{
		this(p);
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("The name is:"+name);
		System.out.println("The id is:"+id);
		System.out.println("The salary is:"+salary);
		System.out.println("The company is:"+company);
		System.out.println("=======================================");
	}
	

}
