package Oops;
import java.util.Scanner;
public class StudentDetails {
	String name;
	int student_id;
	String course;
	double fee;
	long contact;
	String address;
	public void setValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		System.out.println("Enter Student Id:");
		student_id=sc.nextInt();
		System.out.println("Course name:");
		sc.nextLine();
		course=sc.nextLine();
		System.out.println("course fee:");
		fee=sc.nextInt();
		System.out.println("Enter Student Contact No.:");
		contact=sc.nextLong();
		System.out.println("Enter Student Address:");
		sc.nextLine();
		address=sc.nextLine();
		
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
