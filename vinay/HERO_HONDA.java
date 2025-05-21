/*
 *   I1
 *    |
 *   I2
 *   /  \
 * C1     C2
 *  */  


package interfaces_classes;
interface hero_splendor_plus
{
	void mileage_of_hero_splendor_plus();
}
interface hero_hf_delux extends hero_splendor_plus
{
	void mileage_of_hero_hf_delux();
}
class hero_glamour implements hero_hf_delux
{
	public void mileage_of_hero_hf_delux()
	{
		System.out.println("the average milage of hero_hf_delux is 61kppl");
	}
	public void mileage_of_hero_splendor_plus()
	{
		System.out.println("the average milage of hero_splendor_plus is 61kppl");
	}
	void mileage_of_hero_glamour()
	{
		System.out.println("the average milage of hero_glamour is 55kppl");
	}
}
public class HERO_HONDA implements hero_hf_delux{
	public void mileage_of_hero_hf_delux()
	{
		System.out.println("the average milage of hero_hf_delux is 61kppl");
	}
	public void mileage_of_hero_splendor_plus()
	{
		System.out.println("the average milage of hero_splendor_plus is 61kppl");
	}
	void herohonda()
	{
		System.out.println("the hero honda bikes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 hero_glamour h= new hero_glamour();
		 HERO_HONDA h2=new HERO_HONDA();
		 h2.herohonda();
		 h.mileage_of_hero_splendor_plus();
		 h.mileage_of_hero_hf_delux();
		 h.mileage_of_hero_glamour();
		
		 

	}

}
