package game;

import java.util.Scanner;

public class Game extends Weapon {
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score:");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("Congratulation:You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score>400 && score<=800)
		{
			System.out.println("Congratulation:You got the Gun");
			Gun g=new Gun();
			return g;
		}
		else
		{
			System.out.println("Congratulation:You got the Bomb");
			Bomb b=new Bomb();
			return b;
		}
	}

}
