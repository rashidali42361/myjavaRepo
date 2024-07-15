package Oops;

public class WeaponDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon w1=new Weapon();
		w1.name="Rifle";
		w1.material="Stainless Steel";
		w1.weight=4;
		w1.range=1200;
		w1.price=450000;
		System.out.println("Name of weapon is "+w1.name);
		System.out.println("Material of weapon is "+w1.material);
		System.out.println("Weight of weapon in kg is "+w1.weight);
		System.out.println("Range of weapon in meter is "+w1.range);
		System.out.println("Price of weapon is "+w1.price);

	}

}
