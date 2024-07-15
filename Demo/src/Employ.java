
public class Employ {
	
	String name;
	int sal;
	int id;
	Employ(String name,int sal,int id)
	{
		this.name=name;
		this.sal=sal;
		this.id=id;
	}
	public void display()
	{
		System.out.println("Employ name:"+ name);
		System.out.println("Employ sal:"+ sal);
		System.out.println("Employ id:"+ id);
		System.out.println("*****************************************");
	}

	

}
