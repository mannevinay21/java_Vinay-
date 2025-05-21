package vinay;

public class nestedclass {
	void print()
	{
		System.out.println("hi");
	}
	class innnernestedclass
	{
		void show()
		{
			System.out.println("hello");
		}
	}
public static void main(String[]args)
{
	
	nestedclass.innnernestedclass n1=new nestedclass().new innnernestedclass();

	n1.show();
}
}
