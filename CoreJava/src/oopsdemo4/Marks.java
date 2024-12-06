package oopsdemo4;

/**
 * Author :Voggu.Reddy
*Date :30-Oct-2024
*Time :11:36:10 am
*Email :Voggu.Reddy@coforge.com
*/

public class Marks extends Training{
	
	private double marks;

	public Marks(String name, String address, int number,double marks) {
		super(name, address, number);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMarks() {
		System.out.println("Marks:"+marks);
		return (marks*2);
	}
	
	

}
