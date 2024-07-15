package interfacetopic;

public class Rectangle implements Shape {
	double lenth;
	double width;
	Rectangle()
	{
		
	}
	Rectangle(double lenth,double width)
	{
		this.lenth=lenth;
		this.width=width;
	}
	public double parameter()
	{
		double parameter=2*(lenth+width);
		return parameter;
	}
	public double area()
	{
		double area=lenth*width;
		return area;
	}
	

}
