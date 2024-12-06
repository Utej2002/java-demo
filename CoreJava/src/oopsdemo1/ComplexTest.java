package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :3:07:34 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Program to Add 2 Complex Numbers - Real & Imaginary Part
* Demonstrate constructors & this keyword

 */

public class ComplexTest {
	public static void main(String[] args) {
	
	Complex c1= new Complex(10,67);
	Complex c2=new Complex(0.7,3.6);
    c1.add(c2);
    c1.display();
    Complex c3= new Complex(11.6,22.50);
    Complex c4=new Complex(20.20,30.60);
    c3.add(c4);
    c3.display();
	}
	

}
