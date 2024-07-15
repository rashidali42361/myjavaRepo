package methodOverriding;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.run();
		Vehicle v2=new ElectricCar();
		v2.run();
		v1.demo();
		
		
		

	}

}
