package oopsdemo3;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :4:59:17 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Student {

	private int rollNO;
	private String name;

	private static String organization="vtu";
	public Student(int rollNO, String name) {
		this.rollNO = rollNO;
		this.name = name;
	}

	public static void organizationChange() {
		organization="coforge";


	}
	//instance method
	public void display() {
		System.out.println(this.rollNO+" "+this.name+" "+organization);
	}

}
