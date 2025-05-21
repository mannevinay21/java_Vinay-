package vinay;

public class minvalue {
public static void main(String[]args)
{
	int[] a= {36,89,56,41,24,30};
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
    System.out.print(min);
}
}
