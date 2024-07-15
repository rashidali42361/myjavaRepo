package Constructor;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1=new Employ();

		Employ e2=new Employ(e1);
		Employ e3=new Employ("rohan",102);
		Employ e4=new Employ("rohan",102,56400,"HPL");
		Employ e5=new Employ(e4);
		Employ e6=new Employ(e4,67500.44);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		e6.display();
		
		

	}

}
