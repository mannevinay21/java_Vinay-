package vinay;
public class classinsidemethod 
{
	void show()
	{
		class innner
		{
			void print()
			{
				System.out.println("hi vinay class inside method");
			}
		}
		innner n= new innner();
		n.print();
	}
	public static void main(String[]args)
	{
		classinsidemethod c=new classinsidemethod();
		c.show();
		
	}

}
