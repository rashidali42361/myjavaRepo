package Collection;

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
		System.out.println("Name of car is "+name);
		System.out.println("color of car is "+color);
		System.out.println("Price of car is "+price);
		System.out.println("==============================");
	}

}
