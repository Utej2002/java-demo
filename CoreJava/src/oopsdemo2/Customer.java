package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :11:35:11 am
*Email :Voggu.Reddy@coforge.com
*/
/*
 *  Single Inheritance demo for Online-Shopping
 */

public class Customer {
	
	private String name;
	private String  email;
	
	public Customer(String name, String Email, String email) {
		this.email=email;
		this.name=name;
	}
	
	
	 public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }

}
