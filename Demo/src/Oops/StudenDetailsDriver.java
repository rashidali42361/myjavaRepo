package Oops;

public class StudenDetailsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work();

	}
	public static void work()
	{
		StudentDetails s=new StudentDetails();
		s.setValue();
		s.show();
		
		System.out.println("********Enter the next student details*********");
		work();
		
	}

}
