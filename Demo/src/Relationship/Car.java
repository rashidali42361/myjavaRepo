package Relationship;

public class Car {
	String name;
	double price;
	Engine e=new Engine(60,4,"deisel");
	Car()
	{
		
	}
	Car(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	Car(String name,double price,Engine e)
	{
		this(name,price);
		this.e=e;
	}
	public void playMusic()
	{
		System.out.println("Play music in car");

	}
	public void displayCar()
	{
		System.out.println("Name of car:"+name);
		System.out.println("Price of car:"+price);
		e.displayEngine();
		System.out.println("============================");
		
	}

}
