package vinay;
abstract class calculator{
	
	abstract void add();
	abstract void sub();
	static void mul();
	void div();
	void mod();
	
}
public class abstractions extends calculator{
	int a=5,b=4;
      public void add()
      {
    	  System.out.println(a+b);
      }
      
      System.out.println(a+b);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
