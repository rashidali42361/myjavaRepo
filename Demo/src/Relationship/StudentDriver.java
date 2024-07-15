package Relationship;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("Delhi","UP",203393);
		Address a2=new Address("Mumbai","maharastra",245656);
		Student s1=new Student("Rocky",102,a1);
		Student s2=new Student("John",103,a2);
		s1.displayStudent();
		s2.displayStudent();

	}

}
