package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :10:25:40 am
*Email :Voggu.Reddy@coforge.com
*/
//child class of an employee
public class Developer extends Employee {
	
	private String tech;

	public Developer(int empId, String name, float basic, String tech) {
		super(empId, name, basic);
		// TODO Auto-generated constructor stub
		this.tech=tech;
	}
	
	public void dispalyDeveloperDetails() {
		System.out.println("Technology :"+this.tech);
		System.out.println("************************");
	}

}
