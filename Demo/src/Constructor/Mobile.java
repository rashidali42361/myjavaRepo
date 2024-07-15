package Constructor;

public class Mobile {
	
	String name;
	int ram;
	int storage;
	String model;
	int version;
	
	Mobile(	String name)
	{
		this.name=name;
	}
	Mobile(String name,int ram)
	{
		this(name);
		this.ram=ram;
	}
	Mobile(String name,int ram,int storage)
	{
		this(name,ram);
		this.storage=storage;
	}
	Mobile(String name,int ram,int storage,String model)
	{
		this(name,ram,storage);
		this.model=model;
	}
	Mobile(String name,int ram,int storage,String model,int version)
	{

		this(name,ram,storage,model);
		this.version=version;
	}
	public void display()
	{
		System.out.println("Mobile Name:"+this.name);
		System.out.println("Mobile RAM:"+this.ram);
		System.out.println("Mobile Storage:"+this.storage);
		System.out.println("Mobile Model:"+this.model);
		System.out.println("Mobile Version:"+this.name);
		
		
		
		
		
	}
	

}
