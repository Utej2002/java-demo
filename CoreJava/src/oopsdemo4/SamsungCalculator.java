package oopsdemo4;

import java.util.Scanner;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :12:32:20 pm
 *Email :Voggu.Reddy@coforge.com
 */
//Program to design calculator from Interface

public class SamsungCalculator implements ICalculator{

	Scanner kb;

	@Override
	public void add() {




		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform substarction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);		



	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);		

	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform division");
		int a=kb.nextInt();
		int b=kb.nextInt();
		float s=(float)a/b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);		

	}
	 public void display() {
		 System.out.println("make by samsung ");
	 }



}
