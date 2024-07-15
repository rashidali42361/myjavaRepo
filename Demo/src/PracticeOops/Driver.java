package PracticeOops;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Car();
		v.drive();
		Vehicle v1=new ElectricCar();
		v1.drive();
		
		Car c=new ElectricCar();
		c.drive();
		System.out.println(c.s);

	}

}
