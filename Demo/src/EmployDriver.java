
public class EmployDriver {

	public static void main(String[] args) {
		Employ e1=new Employ("arun",1000,101);
		Employ c[]= {new Employ("varun",1000,102),new Employ("akash",2000,103),e1 };
		System.out.println(e1.name);
		c[0].display();
		c[1].display();
		c[2].display();

	}

}
