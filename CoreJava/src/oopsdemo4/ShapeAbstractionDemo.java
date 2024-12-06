package oopsdemo4;

/**
* Author :Voggu.Reddy
*Date :30-Oct-2024
*Time :10:53:39 am
*Email :Voggu.Reddy@coforge.com
*/

public class ShapeAbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shape s=new Circle(34.45);
		s.calculateArea();
		 System.out.println(" Area is :"+s.calculateArea());
		Shape s1=new Square(6);
		s1.calculateArea();
		System.out.println(" Area of square :"+s.calculateArea());

	}

}
