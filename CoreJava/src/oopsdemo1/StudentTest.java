package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :4:39:07 pm
*Email :Voggu.Reddy@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {
		
		
		//create student objects
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		//invoke instance class method using dot operator
		
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		

		
		
		float tot1=s1.calculateTotalMarks();
		float tot2=s2.calculateTotalMarks();
		float tot3=s3.calculateTotalMarks();
		
		s1.displayStudentDetails();
		System.out.println(" Display total marks returned to main: "+tot1);
		s2.displayStudentDetails();
		System.out.println(" Display total marks returned to main:"+tot2);
		s3.displayStudentDetails();
		System.out.println(" Display total marks returned to main:"+tot3);

	}

}
