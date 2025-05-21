package vinay;
class FIXEDAMT
{
	public static int fixedamt=10000;
}
abstract class withdrawal
{
	abstract void withdraw(int amt);
}
public class Bank extends withdrawal{
	FIXEDAMT f=new FIXEDAMT();
	
	void withdraw(int amt)
	{
		System.out.println("the initial amount:"+f.fixedamt);
	System.out.println("the withdraw amount:"+amt);
	f.fixedamt-=amt;
	System.out.println("the amount after withdraw :"+amt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt=Integer.parseInt(args[0]);
		Bank b=new Bank();
		b.withdraw(amt);
	}

}
