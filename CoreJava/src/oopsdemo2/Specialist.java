package oopsdemo2;

/**
 * Author :Voggu.Reddy
 *Date :28-Oct-2024
 *Time :2:25:23 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Specialist extends Doctor{
	private String specialist;

	public Specialist(int idNumber, String name, String address,String specialist) {

		super(idNumber,name, address);
		this.specialist=specialist;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println(" The specialist is:"+specialist);
	}

}
class NonSpecialist extends Doctor{

	private static String name;

	public NonSpecialist(int idNumber, String nameString, String address) {
		super(idNumber, name, address);

	}

}
