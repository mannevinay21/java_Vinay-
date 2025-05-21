package vinay;

public class p2 {
int a=10,b=25,c=6;
void A()
{
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("the a is greater than the other two numbers");
		}
		else
		{
			System.out.println("the c is greater than the other two numbers");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("the b is greater than the other two numbers");
		}
		else
		{
			System.out.println("the c is greater than the other two numbers");
		}
	}
}
public static void main(String[]args)
{
	p2 p=new p2();
	p.A();
}
}
