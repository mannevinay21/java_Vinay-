package interfaces_classes;
interface tomato
{
	void tomatoquantity();
}
interface potato
{
	void potatoquantity();
}
interface list1 extends tomato,potato
{
	void list1items();
}
class list2
{
	void list2items() {
		System.out.println("the list2 items are beetroot 2kgs,carrot 1kg");
	}
}
public class MARKET extends list2 implements list1{
	public void tomatoquantity()
	{
		System.out.println("the tomato quantity is 3kgs");
	}
	public void potatoquantity()
	{
		System.out.println("the potato quantity is 2kgs");
	}
	public void list1items()
	{
		System.out.println("the list1 items are:");
	}
void market()
{
	System.out.println("the market:");
}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MARKET m=new MARKET();
		m.market();
		m.list1items();
		m.tomatoquantity();
		m.potatoquantity();
		m.list2items();
		
	}
	}


