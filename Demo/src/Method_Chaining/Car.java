package Method_Chaining;

public class Car {
	String name;
	String color;
	double price;
	public 	Car setValue(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		return this;
	}
	public void display() {
		System.out.println("car name is "+name);
		System.out.println("car color is "+color);
		System.out.println("car price is "+price);
		System.out.println("========================================");
	}
	}


