package oopsdemo3;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :3:24:15 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Laptop extends Item{

	private String manufacture;



	public Laptop(String name, int price, String manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}



	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(" manufacture :"+manufacture);
	}







}
