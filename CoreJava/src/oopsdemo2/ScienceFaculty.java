package oopsdemo2;

/**
 * Author :Voggu.Reddy
 *Date :28-Oct-2024
 *Time :10:50:25 am
 *Email :Voggu.Reddy@coforge.com
 */
/*
 * ScienceFaculty class inherits from the Faculty class, 
 * adding its own specific attributes and behaviors while 
 * reusing and extending the functionality of the superclass.
 */

public class ScienceFaculty extends Faculty{
	private String department;
	private String researchArea;
	private double bonus;
	public ScienceFaculty(String name, String facultyID, float salary,String department,String researchArea,float bonus) {
		super(name, facultyID, salary);

		this.department=department;
		this.researchArea=researchArea;
		this.bonus=bonus;


	}
	 public void displayDetails() {
	        super.display(); // Call the displayDetails method of the superclass
	        System.out.println("Department: " + department);
	        System.out.println("Research Area: " + researchArea);
	        System.out.println("Bonus: $" + bonus);
	    }
}
