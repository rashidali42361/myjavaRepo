package abstraction;

public abstract class Vehicle {
	public abstract void drive();
	public abstract void start();
	
	public void stop()
	{
		System.out.println("Stop the vehicle");
	}
	public void accelerate()
	{
		System.out.println("accelerate the vehicle");
	}

}
