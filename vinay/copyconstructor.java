package vinay;
public class copyconstructor {
	int x;
	int y;
	public copyconstructor(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("addition:"+(x+y));
	}
	public copyconstructor(copyconstructor c)
	{
		this.x=c.x;
		this.y=c.y;
		System.out.println("multiplication:"+x*y);
	}
	public static void main(String[]args)
	{
		copyconstructor c=new copyconstructor(8,9);
		copyconstructor c1= new copyconstructor(c);
	}

}
