package vinay;
class movie
{
	void genre()
	{
		System.out.println("crime investigaton thirller");
	}
}
class hit1 extends movie
{
	void hero1()
	{
		System.out.println("viswaksen");
	}
}
class  hit2 extends hit1
{
	void hero2()
	{
	System.out.println("adivisesh");
	}
}
class hit3 extends hit2
{
	void hero3()
	{
		System.out.println("nani");
	}
}
class hit4 extends hit2
{
	void hero4()
	{
		System.out.println("karthi");
	}
}
public class hybrid {
public static void main(String[]args)
{
	hit3 h3=new hit3();
	hit4 h4=new hit4();
	h4.hero1();
	h3.hero2();
	h3.hero3();
	h4.hero4();
}
}
