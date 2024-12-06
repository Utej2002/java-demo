package oopsdemo3;

import javax.management.remote.SubjectDelegationPermission;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :2:31:46 pm
 *Email :Voggu.Reddy@coforge.com
 */
/*
 * Overriding is a feature that allows a subclass or
 child class to provide a specific implementation of a method
 that is already provided by one of its super-classes or parent classes.
 */

public class Bank {
	
	private String name;

	public Bank(String name) {
		this.name = name;
	}
	//method to be overridden
	
	int getRateofInterest() {
		return 5;
	}
	
	void dispaly() {
		System.out.println("Welcome to :"+name+"Bank");
	}
    class SBI extends Bank{
        

		public SBI(String name) {
			super(name);
			// TODO Auto-generated constructor stub
			
		}

		@Override
		int getRateofInterest() {
			// TODO Auto-generated method stub
			return super.getRateofInterest();
		
		}
		
    	
    }
    class Axis extends Bank{

		public Axis(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		int getRateofInterest() {
			// TODO Auto-generated method stub
			return super.getRateofInterest();
		}
	
    	
    }
    class icici extends Bank{

		public icici(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		int getRateofInterest() {
			return 6;
		}
    	
    }


}
