package assignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :27-Oct-2024
*Time :3:45:09 pm
*Email :Voggu.Reddy@coforge.com
*/

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter salary and hours per day");
		float salary=sc.nextFloat();
		int hours=sc.nextInt();
	
		Employee e=new Employee();
		
		e.setHours(hours);
		e.setSalary(salary);
		e.getInfo();
		
		
		sc.close();
		
	}

}
