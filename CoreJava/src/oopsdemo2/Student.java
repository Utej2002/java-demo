package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :9:54:56 am
*Email :Voggu.Reddy@coforge.com
*/

public class Student {
	
	private int rollNo;
	private String name;
	
	private Address ad;
	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display()
	{
		System.out.println(" ----------Student Details_________");
		System.out.println("Student Id:"+rollNo);
		System.out.println(" Student name"+name);
		
		System.out.println("Address : "+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	
		
	}
}
