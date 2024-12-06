package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :2:21:54 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * /*Hierarchical Inheritance Demo
 * 
 *              Doctor
 *  Specialist          NonSpecialist
 */


public class Doctor {
	
	private int idNumber;
    protected String name;
	private String address;
    
    public Doctor(int idNumber,String nameString,String address, String name) {
    	this.address=address;
    	this.idNumber=idNumber;
    	this.name=name;
    }
    
    public Doctor(int idNumber2, String name2, String address2) {
		// TODO Auto-generated constructor stub
	}

	public void display() {
        System.out.println("******** Doctor Details ***********");
        System.out.println("The Doctor Id is   : "+idNumber);
        System.out.println("The Doctor Name is : "+name);
        System.out.println("The Doctor City is : "+address);
    }
	
	

}
