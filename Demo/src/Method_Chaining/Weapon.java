package Method_Chaining;

public class Weapon {
	String name;
	double weight;
	double price;
	public static Weapon obj()
	{
		return new Weapon();
	}
	public Weapon setValue(String name,double weight,double price)
	{
		this.name=name;
		this.weight=weight;
		this.price=price;
		return this;
	}
	public void display() {
		System.out.println("Weapon name is "+name);
		System.out.println("Weapon weight is "+weight);
		System.out.println("Weapon price is "+price);
	}

}
