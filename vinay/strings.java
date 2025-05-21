package vinay;

public class strings {
public static void main(String[]args)
{
	String s1="king";
	String s2="ziog";
	String s3=new String("king");
	String s4=new String("king");
	
	System.out.println(s3.equals(s1));
	System.out.println(s3==s1);
	System.out.println(s1.compareTo(s2));
	
}
}
