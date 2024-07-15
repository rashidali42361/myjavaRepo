package Oops;
public class Employee {
	static String ename;
	int eid;
	double salary;
	public void work()
	{
		System.out.println("employee is working");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.ename="mohan";
		e1.eid=1005;
		e1.salary=4569699;
		e1.work();
		System.out.println(e1.ename);
		

	}

}
