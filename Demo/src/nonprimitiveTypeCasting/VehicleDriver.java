package nonprimitiveTypeCasting;

public class VehicleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is upcasting in upcasting all the child member will load in parent refence but we can not access the child class member at parent refence.
		Vehicle v1=new Car();
		System.out.println(v1.x);
		//DownCasting.
		System.out.println("==========Down casting==========");
		Car c1=(Car)v1;
		System.out.println(c1.x);
		System.out.println(c1.y);
		
	}

}
