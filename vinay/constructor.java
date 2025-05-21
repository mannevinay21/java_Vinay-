package vinay;

public class constructor{
	int a;
	int b;
	public constructor(int x,int y)
	{
		a=x;
		b=y;
		
	}
	public void add()
	{
		
		System.out.println(this.a-this.b);
	}
	public static void main(String[]args)
	{
		constructor c= new constructor(85,96);
		c.add();
	
	}

}
