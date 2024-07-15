package Oops;

public class Student {
	String name;
	int student_id;
	String course;
	double fee;
	long contact;
	String address;
	public void setValue(String n,int i,String c,double f,long cn,String a)
	{
		name=n;
		student_id=i;
		course=c;
		contact=cn;
		address=a;
		fee=f;
	}
	public void show()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:"+student_id);
		System.out.println("Course Name :"+course);
		System.out.println("Course Fee:"+fee);
		System.out.println("Contact Number:"+contact);
		System.out.println("Permanent address.:"+address);
		
	}
		

	
}
