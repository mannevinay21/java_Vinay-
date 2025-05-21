package vinay;

public class question {
public static void main(String[]args)
{
	String s="helloworld";
	String v="";
	String co="";
	char c;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			v+=c;
		}
		else
		{
			co+=c;
		}
		if(c=='l')
		{
			count++;
		}
	}
	
		System.out.println("vowels:"+v);
	System.out.println("consonents:"+co);
	System.out.println(count);
}
}
