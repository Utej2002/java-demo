package oopsdemo1;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Author :Voggu.Reddy
 *Date :25-Oct-2024
 *Time :4:12:26 pm
 *Email :Voggu.Reddy@coforge.com
 */
/*
 * program to create instance class define state and behaviour
 */

public class Student {

	

		//define properties/state/attributes

		private int rollNumber;
		private String firstName,lastName;
		private float[] marks=new float[5];
		private float total;
		
		Scanner sc=new Scanner(System.in);

		//define methods/behavior/actions

		public void inputStudentDetails() {

			System.out.println("enter Roll number of a student:");
			rollNumber=sc.nextInt();
			
			System.out.println(" enter firstname && last name of student");
			firstName=sc.next();
			lastName=sc.next();
			 
			System.out.println("  enetr marks of 5 subjects:");
			for( int i=0; i<marks.length;i++) {
			marks[i]=sc.nextFloat();
			}
			
			

		}
		//method with float as return type
		
		public float calculateTotalMarks() 
		{
			for(int i =0; i< marks.length;i++)
			{
				total+=marks[i];
			}
			return total;
			
		    



	}
		public void displayStudentDetails() {
			System.out.println("*********student result info************");
			System.out.println("roll number   :"+rollNumber);
			System.out.println("Student name  :"+firstName+" "+lastName);
			System.out.println("total marks   :"+total);
			
		}

}
