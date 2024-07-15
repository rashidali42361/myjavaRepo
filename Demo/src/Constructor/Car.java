package Constructor;

public class Car {
	String name;
	String color;
	double price;
	Car(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void display() {
		System.out.println("Name of the car:"+name);
		System.out.println("color of the car:"+color);
		System.out.println("price of the car:"+price);
	}

}
