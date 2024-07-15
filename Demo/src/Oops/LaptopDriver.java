package Oops;

public class LaptopDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop();
		l1.name="HP i40";
		l1.os="window";
		l1.ram=4;
		l1.price=67000;
		l1.weight=1;
		System.out.println(l1);
		System.out.println(l1.name);
		System.out.println(l1.os);
		System.out.println(l1.ram);
		System.out.println(l1.price);
		System.out.println(l1.weight);
		l1.work();
		

	}

}
