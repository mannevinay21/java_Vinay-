package vinaymanne;


class superclass
{
	int v=100;
	public superclass()
	{
		
		System.out.println("the is the constructor of the class superclass");
	}
	void hi()
	{
		System.out.println("hi from super class");
	}
	
}
public class SUPER extends superclass{
	void show()
	{
		int y=10;
		System.out.println(super.v);
		super.hi();
		
		
	}
	public SUPER()
	{
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUPER S=new SUPER();
		S.show();
		
	}

}
