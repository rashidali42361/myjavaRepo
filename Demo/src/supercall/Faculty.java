package supercall;

public class Faculty extends College{
	String facName;
	String subject;
	int salary;
	Faculty(String name,int id,String address,String facName,String subject,int salary)
	{
		super(name,id,address);
		this.facName=facName;
		this.subject=subject;
		this.salary=salary;
		
	}
	public void displayFacultyData()
	{
		System.out.println("===============================");
		super.displayCollege();
		System.out.println("********************************");
		System.out.println("Faculty name:"+facName);
		System.out.println("Faculty subject:"+subject);
		System.out.println("Faculty salary:"+salary);
	}

}
