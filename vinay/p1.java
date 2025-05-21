package vinay;

public class p1 {
	int a=-5;
	void A()
	{
		if(a<=0) {
			System.out.println("the number is negative does not lie between 1 to 10");
		}
		else
		{
			if(a>=1 && a<=10)
			{
				System.out.println("the number lies between 1 to 10");
			}
			else
			{
				System.out.println("no the number dont exists in 1 to 10");
			}
		}
	}
public static void main(String[]args)
{
	
	p1 a=new p1();
	a.A();
}
}
