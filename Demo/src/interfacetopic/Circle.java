package interfacetopic;

import java.util.Scanner;

public class Circle implements Shape{
	double radius;
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double  parameter()
	{
		double parameter=2*3.14*radius;
		return parameter;
	}
	public double  area()
	{
		double area=3.14*radius*radius;
		return area;
	}
	
}
