package Method_Chaining;

public class Movie {
	String title;
	double budget;
	String status;
	public static Movie obj()
	{
		Movie m=new Movie();
		return m;
	}
	public Movie setValue(String title,double budget,String status)
	{
		this.title=title;
		this.budget=budget;
		this.status=status;
		return this;
	}
	public void display()
	{
		System.out.println("The movie title:"+title);
		System.out.println("Movie budget:"+budget);
		System.out.println("Movie status:"+status);
	}

}
