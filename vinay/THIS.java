package vinaymanne;

public class THIS {
     int a=100;
	void add()
	{
		int a=10;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THIS t=new THIS();
	
		t.sub();

	}

}
