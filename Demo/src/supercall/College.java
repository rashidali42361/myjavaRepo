package supercall;

public class College {
	String name;
	int code;
	String address;
	College()
	{
		
	}
	College(String name,int code,String address)
	{
		this.name=name;
		this.code=code;
		this.address=address;
	}
	public void displayCollege()
	{
		System.out.println("College name:"+name);
		System.out.println("College code:"+code);
		System.out.println("College address:"+address);
	}

}
