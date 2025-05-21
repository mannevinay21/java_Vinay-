package vinay;

public class encapsulation {
private String firstName;
private String lastName;
private String email;
private long phone;
public void setfirstName(String fn)
{
	firstName=fn;
}
public void setlastName(String ln)
{
	lastName=ln;
}
public void setemail(String e)
{
	email=e;
}
public void setphone(long p)
{
	phone=p;
}
public String getfirstName()
{
	return firstName;
}
public String getlastName()
{
	return lastName;
}
public String getemail()
{
	return email;
}
public long getphone()
{
	return phone;
}
public static void main(String[]args)
{
	encapsulation e=new encapsulation();
	e.setfirstName("manne");
	e.setlastName("vinay");
	e.setemail("vinaymanne528@gmail.com");
	e.setphone(8341466502l);
	System.out.println(e.getfirstName());
	System.out.println(e.getlastName());
	System.out.println(e.getemail());
	System.out.println(e.getphone());
	
	
}
}
