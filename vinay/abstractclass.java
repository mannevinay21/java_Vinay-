package vinay;
abstract class sum
{
	
	abstract void add();
	abstract void sub();
	static void mul()
	{
		
			int a=4,b=5;
			System.out.println(a*b);
		
	}
	
	void div()
	{
		int x=4,y=5;
		System.out.println(x/y);
	}
	void mod()
	{
		int p=5,q=4;
		System.out.println(p%q);
	}
}
class abstractclass extends sum{
	int a=4,b=5;
public void add()
{
	
	System.out.println(a+b);
}
public void sub()
{
	System.out.println(a-b);
}



	public static void main(String[] args) {
		
		abstractclass a=new abstractclass();
		a.add();
		a.sub();
		sum.mul();
		a.div();
		a.mod();
	}

}
