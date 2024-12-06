package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :3:00:38 pm
*Email :Voggu.Reddy@coforge.com
*Program to Add 2 Complex Numbers - Real & Imaginary Part
* Demonstrate constructors & this keyword
*/

public class Complex {
	
	private double real;
	private double imaginary;
	
	//generate parameterized constructor
	
	public Complex( double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	//logi to add 2 complex numbers
	//method accepting complex objects
	
	public void add(Complex obj) {
		

	this.real+=obj.real;
	this.imaginary+=obj.imaginary;
	}
	public void display() {
		System.out.println("The Addition of 2 Complex Numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);
	}
	
	
	

}
