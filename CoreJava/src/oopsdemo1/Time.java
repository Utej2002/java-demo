package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :3:18:26 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Java program to perform addition of 2 Times
 */

public class Time {
	
	private int hrs,min,sec;
	public Time(int hrs , int min, int sec) {
	
	//generate parameterized constructor
	
		this.hrs=hrs;
		this.min=min;
		this.sec=sec;
	}
	public void add(Time obj) {
		

		this.hrs+=obj.hrs;
		this.min+=obj.min;
		this.sec+=obj.sec;
		if(this.sec>60) {
			this.sec-=60;
			this.min+=60;
			
		}
		if(this.min>=60) {
			this.min-=60;
			this.hrs+=1;
		
		}
	}
	    
		public void display() {
			System.out.println("The Addition of 3 Times is :");
			System.out.println("hrs"+this.hrs+" min"+this.min+"sec"+this.sec);
		}
		
	
	

}
