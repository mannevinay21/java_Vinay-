package vinay;

public class exception {
	public static void main(String[]args)
	{
		int a=99;
		
		System.out.println("Division by zero:");
		try
		{
			int b=Integer.parseInt(args[0]);
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception v)
		{
			System.out.println(v.getMessage());
			System.out.println(v.toString());
			v.printStackTrace();
			
		}
		System.out.println("division of zero is sucesfully performed");
		
	}

}
