package Method_Chaining;

public class Mobile {
	String name;
	String model;
	int ram;
	double price;
	public Mobile setValue(String name,String model,int ram,double price)
	{
		this.name=name;
		this.model=model;
		this.ram=ram;
		this.price=price;
		return this;
	}
	public void display()
	{
		System.out.println("Mobile name:"+name);
		System.out.println("Mobile model:"+model);
		System.out.println("Mobile ram:"+ram);
		System.out.println("Mobile price:"+price);
	}

}
