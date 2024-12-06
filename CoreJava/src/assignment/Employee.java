package assignment;

/**
 * Author :Voggu.Reddy
 *Date :27-Oct-2024
 *Time :3:38:43 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Employee {

	private float salary;
	private int hours;
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	public void getInfo() {
	addsalary();
	addhours();
	System.out.println("final salary is:$"+salary);}

	public void addsalary() {
		if(salary>500) {
			salary=salary+10;
		}
	}


		
	
	public void addhours() {
		if(hours>6) {
			salary+= 5;
		
	}
	}
	

}