/*PROGRAM 1:
* I1    I2*
*         *    
*  \  /   *
*   I3    *
*   |     *
*   C1    *
 */
package interfaces_classes;
interface biryani{
	void priceofbiryani();
}
interface shawarma
{
	void priceofshawarma();
}
interface pistahouse extends biryani,shawarma
{
	void priceinpistahouse();
}
public class restaurant implements pistahouse{
	public void priceinpistahouse()
	{
		System.out.println("THE PRICES IN THE PISTAHOUSE:");
	}
	public void priceofbiryani()
	{
		System.out.println("-----------------BIRYANI---------------");
		System.out.println("biryani:250rs single");
		System.out.println("biryani:350rs full");
	}
	public void  priceofshawarma()
	{
		System.out.println("--------------SHAWARMA----------------");
		System.out.println("shawarma:70rs small");
		System.out.println("shawarma:140rs large");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		restaurant r=new restaurant();
		r.priceinpistahouse();
		r.priceofbiryani();
		r.priceofshawarma();
	}

}
