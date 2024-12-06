package oopsdemo3;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :12:14:53 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Addition {

	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//add() method overloaded
	public void add() {

		System.out.println("*******Method overloading Demo***********");
		System.out.println("The addition of 2 integers is:"+(a+b));
	}
	public void add(int x) {
		System.out.println("The addition of single number to itself:"+(x+x));

	}
	public void add(int x,int y) {
		System.out.println("The addition of two numbers:"+(x+y));


	}
	public void add(int x,float y) {
		System.out.println("The addition of integer and float:"+(x+y));
	}
	public void add(String x,String y) {
		System.out.println("The addition of 2 strings:"+(x+y));
	}
	public void add(double x,double y) {
		System.out.println("The addition of 2 double numbers is:"+(x+y));
	}
	public void add(int x,int y, int z) {
		System.out.println("The addition of 3 numbers is:"+(x+y+z));
	}

}
