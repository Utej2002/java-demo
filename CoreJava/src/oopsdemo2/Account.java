package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :12:03:36 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Account {
	//Java Program to demonstrate Banking Transactions using Multi-Level Inheritance

	private int accountNumber;
	    private String name;
	    
	    public Account(int accountnumber, String name) {
	    	this.accountNumber=accountnumber;
	    	this.name=name;
	   
	    }
	    
	    
	    public void display() {
	        System.out.println("********** Account Details ***********");
	        System.out.println("Account Number : "+accountNumber);
	        System.out.println("Customer Name  :"+name);
	    }

}
