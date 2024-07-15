package Constructor;

public class Laptop {
	String name;
	String color;
	String os;
	int ram;
	double price;
	Laptop(String name)
	{
		this.name=name;
	}
	Laptop(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	Laptop(String name,String color,String os)
	{
		this.name=name;
		this.color=color;
		this.os=os;
	}
	Laptop(String name,String color,String os,double price)
	{
		this.name=name;
		this.color=color;
		this.os=os;
		this.price=price;
	}
	public void display() {
		System.out.println("Name of the laptop:"+name);
		System.out.println("color of the laptop:"+color);
		System.out.println("price of the laptop:"+price);
		System.out.println("Ram of the laptop:"+color);
		System.out.println("OS of the laptop:"+price);
	}
	

}
