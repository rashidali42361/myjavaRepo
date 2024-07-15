package Method_Chaining;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setValue("Rozik",29,121);
		s.display();
		s.setValue("Deni", 35,124).display();
		s.setValue("sam curren", 26, 125).display();
		System.out.println("=========without object creatioon in driver class ===========");
		Student.obj().setValue("roni",34, 123).display();

	}

}  
