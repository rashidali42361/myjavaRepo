package Collection;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c5=new Car("Honda","RED",546767);
		Car c6=new Car("Yamaha","black",600000);
		Car[] c= {new Car("Audi","Black",475655), new Car("Maruti","Black",545333), c5};
	
		
		System.out.println(c[0]);
		System.out.println(c[0].name);
		System.out.println(c[1].color);
		
		c[0].display();
		c[1].display();
		c[2].display();
	}

	

}
