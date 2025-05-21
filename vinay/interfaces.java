package vinay;
interface i1
{
	void HI();
	void BYE();
}
public class interfaces implements i1{
	public void HI()
	{
		System.out.println("hi");
	}
	public void BYE()
	{
		System.out.println("bye");
	}
public static void main(String[]args)
{
	interfaces i=new interfaces();
	i.HI();
	i.BYE();
}
}
