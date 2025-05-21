/*
 * 	I1   C1
 *    \/
 *    C2
 *    |
 *    C3
 */

package interfaces_classes;
interface andhrapradesh
{
	void thecapitalofandhrapradesh();
}
class telangana{
	void thecapitaloftelangana()
	{
		System.out.println("the capital of telangana is hyderabad");
	}
}
class telugustates extends telangana implements andhrapradesh
{
	public void thecapitalofandhrapradesh()
	{
		System.out.println("the capital of andhrapradesh is amaravathi");
	}
	void telugustates()
	{
		System.out.println("the two telugu speaking states are telangana and andhrapradesh");
	}
}
public class capitals extends  telugustates{
	void thecapitalsoftelugustates()
	{
		System.out.println("In india there are two telugu speaking states.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capitals c=new capitals();
		c.thecapitalsoftelugustates();
		c.telugustates();
		c.thecapitalofandhrapradesh();
        c.thecapitaloftelangana();
	}

}
