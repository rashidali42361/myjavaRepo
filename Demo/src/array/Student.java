package array;

public class Student {
	String name;
	String college;
	int yearOfPassout;
	String degree;
	Student(String name,String college,int yearOfPassout,String degree)
	{
		this.name=name;
		this.college=college;
		this.yearOfPassout=yearOfPassout;
		this.degree=degree;
	}
	public static void main(String[]args)
	{
		Student s[]=new Student[5];
		Student s1=new Student("gopi","xyz",2017,"BCA");
		Student s2=new Student("zimmi","xyz",2018,"MCA");
		Student s3=new Student("Raj","yuz",2017,"BCA");
		Student s4=new Student("Zinger","xyz",2007,"BBA");
		Student s5=new Student("Azmal","xyp",2017,"MBA");
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i].name);
		}
	}
	

}
