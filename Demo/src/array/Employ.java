package array;

public class Employ {
	String name;
	int id;
	double salary;
	int yop;
	Employ(String name,int id,double salary,int yop)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.yop=yop;
				
	}
	public static void main(String[]args)
	{
		Employ[ ] e=new Employ[4];
		e[0]=new Employ("raj",102,56400,2012);
		e[1]=new Employ("raju",103,56400,2012);
		e[2]=new Employ("akash",104,56400,2012);
		e[3]=new Employ("ranjan",105,56400,2012);
		//System.out.println(e[0].name+" " +e[0].id+ " "+e[0].salary);
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].name+" " +e[i].id+ " "+e[i].salary+" "+e[i].yop );
		}

		
	}
}
