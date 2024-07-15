package Relationship;

public class Student {
	String name;
	double age;
	Address ad;
	Student(String name,int age,Address ad)
	{
		this.name=name;
		this.age=age;
		this.ad=ad;
	
	}
	public void displayStudent()
	{
		System.out.println("Name of student:"+name);
		System.out.println("Age of student:"+age);
		ad.addressDisplay();
		System.out.println("==============================================");
	}

}
