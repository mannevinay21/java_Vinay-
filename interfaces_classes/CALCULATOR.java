package interfaces_classes;
/*
 * I1  I2  I3
 * |   |   |
 * C1  C2  C3
 */
interface addition
{
	void sum();
}
interface subtraction
{
	void sub();
}
interface multiplication
{
	void mul();
}
class additionclass implements addition
{
	int a=2,b=3;
	public void sum()
	{
		System.out.println("the addition of a,b is"+(a+b));
	}
}
class subtractionclass implements subtraction
{
	int a=10,b=3;
	public void sub()
	{
		System.out.println("the subtration of:"+a+","+b+" is "+(a-b));
	}
}
public class CALCULATOR implements multiplication{
	public void mul()
	{
		int a=10,b=5;
		System.out.println("the multiplication of:"+a+","+b+" is "+(a*b));
	}
	public static void main(String[]args)
	{
		additionclass a=new additionclass();
		a.sum();
		subtractionclass b=new subtractionclass();
		b.sub();
		CALCULATOR c=new CALCULATOR();
		c.mul();
		
	}

}
