package oopsdemo4;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :10:47:09 am
 *Email :Voggu.Reddy@coforge.com
 */

public class Circle extends Shape{

	private final double radius;
	private double PI=3.14;


	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius;
	}






}
