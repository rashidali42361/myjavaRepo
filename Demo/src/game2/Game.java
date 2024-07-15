package game2;

import java.util.Scanner;

public class Game  {
	public Weapon pressButton()
	{
		System.out.println("Pleasse enter your score.");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("Congratulation! you got  a knife.");
			Knife k=new Knife();
			return k;
		}
		else if(score>400 && score<=800)
		{
			System.out.println("Congratulation! you got a gun...");
			Gun g=new Gun();
			return g;
		}
		else
		{
			System.out.println("Congratulation!You got a explosive bomb...");
			Bomb b=new Bomb();
			return b;
		}
		
	}

}
