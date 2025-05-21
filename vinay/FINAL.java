package vinaymanne;
class test

{
	void add()
	{
		System.out.println("hi");
	}
}
public class FINAL extends test{
	void add()
	{
	int a=23;
		System.out.println(a);
		
		System.out.println(a);
	}
	public static void main(String[]args)
	{
		FINAL f=new FINAL();
		f.add();
	}

}
