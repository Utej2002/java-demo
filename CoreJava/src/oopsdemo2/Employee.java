package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :10:15:57 am
*Email :Voggu.Reddy@coforge.com
*/

public class Employee {
	
	private int empID; 
	private String name;
	private float basic;
	
	//generate constructor using fields
	
	public Employee(int empId, String name, float basic) {
		
		this.empID=empId;
		this.basic=basic;
		this.name=name;
	}
	
	public void Display() {
		System.out.println(" ******Employee information**********");
		System.out.println(" Employee Id  :"+empID);
		System.out.println(" Employee name :"+name);
		System.out.println(" Basic Salary:"+basic);
		
	}

}
