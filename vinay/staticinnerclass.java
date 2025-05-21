package vinay;
class Smaple
{
	private static void show()
	{
		System.out.println("hi");
	}
	static class Test
	{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class staticinnerclass {
public static void main(String[]args)
{
	Smaple.Test.print();
}
}
