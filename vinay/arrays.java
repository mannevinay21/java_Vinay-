package vinay;
import java.util.Scanner;
public class arrays {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int a[]= {62,20,31,58,69};
    boolean t=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==a[x])
		{
			
			t=true;
		}
		else
		{
			t=false;
		}
		
	}
	if(t)
	{
		System.out.println(a[x]);
	}
	else
	{
		System.out.println("the element not found!");
	}
}
}
