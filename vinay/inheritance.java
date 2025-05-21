package vinay;
class animal
{
	void sleep()
	{
		System.out.println("sleeping");
	}
}
class dog extends animal{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
public class inheritance {
public static void main(String[]args)
{
	dog d=new dog();
	d.sleep();
	d.bark();
}
}
