/*
 *  I1 I2 I3
 *   \ | /
 *    I4
 *     |
 *    C1
 */


package interfaces_classes;
interface tata_Altroz
{
	void priceoftata_Altroz();
}
interface tata_nexon
{
	void priceoftata_nexon();
}
interface tata_harrier
{
	void priceoftata_harrier();
}
interface carmodel extends tata_Altroz,tata_nexon,tata_harrier
{
	void thecarmodel();
}
public class tatamotors implements carmodel{
public void priceoftata_Altroz()
{
	System.out.println("the price of tata altroz in hyderabad is:6.65 lakh");
}
public void priceoftata_nexon()
{
	System.out.println("the price of tata nexon in hyderabad is:8 lakh");
}
public void priceoftata_harrier()
{
	System.out.println("the price of tata nexon in hyderabad is:15 lakh");
}
public void thecarmodel()
{
	System.out.println("the car model is TATA:");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tatamotors t=new tatamotors();
		t.thecarmodel();
		t.priceoftata_Altroz();
		t.priceoftata_nexon();
		t.priceoftata_harrier();

	}

}
