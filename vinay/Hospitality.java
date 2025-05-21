package vinaymanne;

interface Pharmacys
{
	void providemedicines();
}
interface Receptionists
{
	void appointment();
}
class Doctors
{
	void treatment()
	{
		System.out.println("doctor treats patient");
	}
}
public class Hospitality extends Doctors implements Pharmacys,Receptionists{
	
	public void providemedicines()
	{
		System.out.println("the pharmacy provides medicines");
	}
	public void appointment(){
		System.out.println("the receptionist sets the appointment");
	}
public static void main(String[]args)
{
	Hospitality  h=new Hospitality();
	h.providemedicines();
	h.appointment();
	h.treatment();
	
}
}

