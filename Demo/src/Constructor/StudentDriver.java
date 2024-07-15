package Constructor;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Rohan");
		s1.display();
		Student s2=new Student("Rohan",1423);
		s1.display();
		Student s3=new Student("Rohan",1423,34);
		s3.display();
		Student s4=new Student("Rohan",1423,34,"Delhi");
		s4.display();
		Student s5=new Student(s3);
		s5.display();
		Student s6=new Student(s3,"Kanpur");
		s6.display();
		Student s7=new Student(s4,"Gujrat");
		s7.display();

	}

}
