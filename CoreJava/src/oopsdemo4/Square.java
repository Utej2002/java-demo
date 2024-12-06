package oopsdemo4;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :10:51:30 am
 *Email :Voggu.Reddy@coforge.com
 */

public class Square extends Shape{

	private final double side;


	public Square(double side) {
		this.side = side;
	}


	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}


}
