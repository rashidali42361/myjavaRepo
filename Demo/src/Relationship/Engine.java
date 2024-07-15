package Relationship;

public class Engine {
	
	int hp;
	int stroke;
	String type;
	Engine()
	{
		System.out.println("this is empty constructor");
	}
	Engine(int hp,int stroke,String type)
	{
		this.hp=hp;
		this.stroke=stroke;
		this.type=type;
	}
	public void start()
	{
		System.out.println("Start the engine");
	}
	public void displayEngine()
	{
		System.out.println("Hp of the engine:"+hp);
		System.out.println("Stroke of the engine:"+stroke);
		System.out.println("Type of the engine:"+type);
	}

}
