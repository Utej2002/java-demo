package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :11:11:00 am
*Email :Voggu.Reddy@coforge.com
*/

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create of object of employee class
		
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee emp3= new Employee();
		
		//invoke methods of employee class using object
		emp1.inputEmployee();
		emp1.calculateNetSalary();
		emp1.displayEmployeeDetails();
		emp2.inputEmployee();
		emp2.calculateNetSalary();
		emp2.displayEmployeeDetails();
		emp3.inputEmployee();
		emp3.calculateNetSalary();
		emp3.displayEmployeeDetails();
		

	}

}
