package Oops;

public class Train {
	String name;
	double price;
	String color;
	double length;
	Train(String name,double price,String color,double length)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.length=length;
	}
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The color is "+color);
		System.out.println("The price is "+price);
		System.out.println("The length is "+length);
	}

}
