package Oops;

public class Car {
	String name;
	String color;
	double price;
	Car(String n,String c,double p)
	{
		name=n;
		color=c;
		price=p;
	}
	public void display() {
		System.out.println("Car name is "+name);
		System.out.println("Car color is "+color);
		System.out.println("Car price is "+price);
	}
	

	
}
