package vinay;

public class multipleconstrutors {
	int scc;
	int inter;
	int btech;
	public multipleconstrutors()
	{
		System.out.println("welcome to my marks");
	}
	public multipleconstrutors(int scc)
	{
		this.scc=scc;
		System.out.println("my scc marks:"+scc);
	}
	public multipleconstrutors(int scc,int inter)
	{
		this.scc=scc;
		this.inter=inter;
		System.out.println("my scc marks:"+scc);
		System.out.println("my inter marks:"+inter);
	}public multipleconstrutors(int scc,int inter,int btech)
	{
		this.scc=scc;
		this.inter=inter;
		this.btech=btech;
		System.out.println("my scc marks:"+scc);
		System.out.println("my inter marks:"+inter);
		System.out.println("my btech marks:"+btech);
	}
	public static void main(String[]args)
	{
		multipleconstrutors m=new multipleconstrutors();
		multipleconstrutors m1=new multipleconstrutors(10);
		multipleconstrutors m2=new multipleconstrutors(10,90);
		multipleconstrutors m3=new multipleconstrutors(10,90,70);
	}
}
