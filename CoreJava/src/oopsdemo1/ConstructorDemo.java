package oopsdemo1;

/**
 * Author :Voggu.Reddy
 *Date :26-Oct-2024
 *Time :2:36:22 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class ConstructorDemo {

	int id;
	String name;
	float salary;
	public ConstructorDemo() {
	System.out.println(" No args/Implicit constructors");
	this.id = 101;
	this.name = "nitihn puspur";
	this.salary = 5000.00f;
	}
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void name() {
		System.out.println(" Iam a Method");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}




	




	public static void main(String[] args) {
		
		ConstructorDemo cd1= new ConstructorDemo();
		ConstructorDemo cd2 =new ConstructorDemo(1002,"nitihn",3455.0f);
		cd1.name();
		cd2.name();
		cd2.name();

	}

}
