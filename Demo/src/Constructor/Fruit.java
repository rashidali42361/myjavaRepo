package Constructor;

import java.awt.geom.Arc2D.Float;

public class Fruit {
	String name;
	String color;
	float calory;
	float weight;
	Fruit()
	{
		System.out.println("fruit object is created");
	}
	Fruit(String name)
	{
		this();
		this.name=name;
	}
	Fruit(String name,String color)
	{
		this(name);
		this.color=color;
	}
	Fruit(String name,String color,float calory)
	{
		this(name,color);
		this.calory=calory;
	}
	Fruit(String name,String color,float calory,float weight)
	{
		this(name,color,calory);
		this.weight=weight;
	}
	public void display()
	{
		System.out.println("Name of the fruit: "+name);
		System.out.println("Color of fruit: "+color);
		System.out.println("calory in fruit: "+calory);
		System.out.println("Weight of color: "+weight);
	}

}
