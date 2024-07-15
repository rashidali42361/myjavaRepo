package Relationship;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Honda city",867504);
		Car c2=new Car("Tesla",9596245);
		//c.playMusic();
		c1.e.displayEngine();
		System.out.println("=======================");
		c1.displayCar();
		System.out.println("=======================");
		c2.displayCar();
		Car c3=new Car("Jaguar",11999860,new Engine(80,8,"petrole"));
		c3.displayCar();
		Car c4=new Car("Jaguar",11999860);
		c4.displayCar();
		
		

	}

}
