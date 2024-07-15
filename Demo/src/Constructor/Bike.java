package Constructor;
//constructor chaining.

public class Bike {
	
	String name;
	String color;
	int stroke;
	double price;
	Bike(String name)
	{
		
		
		this.name=name;
	}
	Bike(String name,String color)
	{
		this(name);
		this.color=color;
	}
	Bike(String name,String color,int stroke)
	{
		this(name,color);
		this.stroke=stroke;
	}
	Bike(String name,String color,int stroke,double price)
	{
		this(name,color,stroke);
		this.price=price;
	}
	public void display() {
		System.out.println("Name of the Bike:"+name);
		System.out.println("color of the Bike:"+color);
		System.out.println("price of the Bike:"+price);
		System.out.println("Stroke of the Bike:"+stroke);
		
	}
	

}
