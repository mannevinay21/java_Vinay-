package interfaces_classes;
interface pond
{
	void pondfeature();
}
class lake
{
	void lakefeature()
	{
		System.out.println("the lake is the water resourse mainly consists water sufficients for the village");
	}
}
class ocean
{
	void ocenfeatures()
	{
		System.out.println("the ocean is the lagest water resoure there are 5 oceans in the world");
	}
}
class river extends lake implements pond
{
	public void pondfeature()
	{
		System.out.println("the pond is the smallest amoung all the water bodies");
	}
	void rivers()
	{
		System.out.println("the rivers are the largest resourses amoung the country");
	}
	
}
public class WATERSOURCE extends ocean{

	void WATERSOURCES()
	{
		System.out.println("earth consists of several water resources:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WATERSOURCE w=new WATERSOURCE();
		w.WATERSOURCES();
		w.ocenfeatures();
		river r=new river();
		r.pondfeature();
		r.lakefeature();
		r.rivers();

	}

}
