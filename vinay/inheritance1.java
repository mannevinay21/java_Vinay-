package vinay;
class fruits
{
	void eat()
	{
		System.out.println("healthy");
	}
}
class apple extends fruits
{
	void colour()
	{
		System.out.println("red");
	}
}
class mango extends fruits
{
	void price()
	{
	System.out.println("200kg");
	}
}
class banana extends fruits
{
	void dozen()
	{
		System.out.println("dozen of bananas consists 12");
	}
}
public class inheritance1 {
public static void main(String[]args)
{
	apple a=new apple();
	mango m=new mango();
	banana b=new banana();
	a.eat();
	a.colour();
	System.out.println("the fruits method is assced by the apple method");
	m.eat();
	m.price();
	System.out.println("the fruits method is assced by the mango method");
	b.eat();
	b.dozen();
	System.out.println("the fruits method is assced by the banana method");
	
}
}
