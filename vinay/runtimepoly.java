package vinay;
class test1
{
	void mains()
	{
		System.out.println("hi");
	}
}
class test2 extends test1
{
	void mains()
	{
		System.out.println("bye");
	}
}
public class runtimepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t2=new test2();
		t2.mains();

	}

}
