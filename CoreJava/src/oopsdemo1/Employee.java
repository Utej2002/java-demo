package oopsdemo1;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :10:47:53 am
*Email :Voggu.Reddy@coforge.com
*/
/*
 * program to display employee details 
 */

public class Employee {

	
		// data abstraction define properties and methods as per application in  hand.
		//define attribute
		
		private int empId;
		private String firstName,lastName,desig;
		private double basic,hra,da,grossSalary,netSalary;
		
		private static final double TAX=1000;
		
		Scanner sc= new Scanner(System.in);
		
		//default constructor
		//compiler creates it for automatic initialization of object properties
		//define methods
		
		public void inputEmployee()
		{
			
			System.out.println(" enter EmployeeId,fname,lname&designation:");
			empId=sc.nextInt();
			firstName=sc.next();
			lastName=sc.next();
			
			sc.nextLine();
			
			desig=sc.next();
			
			System.out.println(" enter basic salary of employee");
			
			basic= sc.nextDouble();
			
			
		}
		public void calculateNetSalary()
		{
			hra=basic*0.25;
			da=basic*0.15;
			grossSalary=basic+hra+da;
			netSalary=grossSalary-TAX;
			
	
		}
		
		public void displayEmployeeDetails()
		{
			System.out.println("*******employee salary**********");
			System.out.println("Employee Id :"+empId);
			System.out.println("employee Name:"+firstName+"+lastName");
			System.out.println("Designation:"+desig);
			System.out.println("Basics:"+basic);
			System.out.println("HRA:"+hra);
			System.out.println("dearness allow"+da);
			System.out.println("Gross salary"+grossSalary);
			System.out.println("tax:"+TAX);
			System.out.println("------------------------");
			System.out.println("Net Salary:"+netSalary);
			System.out.println("---------------------------");
		}
		
		
		

	}


