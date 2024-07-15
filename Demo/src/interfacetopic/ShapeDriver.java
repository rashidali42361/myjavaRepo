package interfacetopic;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle(4);
		System.out.println("Area of circle is "+c.area());
		System.out.println("Parameter of circle is "+c.parameter());
		System.out.println("====================================");
		Shape r=new Rectangle(12,15);
		System.out.println("Area of Rectangle is "+r.area());
		System.out.println("Parameter of Rectangle is "+r.parameter());
		
	}

}
