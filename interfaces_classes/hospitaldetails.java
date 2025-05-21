/*
 * I1  I2  C1
 *   \ | /
 *    C2
 */
package interfaces_classes;
interface Doctor 
{
    void showDoctorDetails();
}
interface Nurse
{
    void showNurseDetails();
}
class Hospital
{
    void showHospitalDetails()
    {
        System.out.println("Hospital Name: CityCare Hospital");
    }
}
public class hospitaldetails extends Hospital implements Doctor, Nurse
{
 public void showDoctorDetails()
 {
        System.out.println("Doctor:Dr.Meera(MBBS)");
 }
    public void showNurseDetails() 
    {
        System.out.println("Nurse:Rina Das(ICU Department)");
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	hospitaldetails h = new hospitaldetails();
        h.showHospitalDetails();
        h.showDoctorDetails();
        h.showNurseDetails();
    }
}
