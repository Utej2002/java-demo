package oopsdemo4;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :3:05:10 pm
 *Email :Voggu.Reddy@coforge.com
 */
//multiple Interface implementation - multiple inheritance
//StudentDetails class implements abstract methods of 2 Interfaces



public class StudentDetails implements CollegeData,HostelData{

	College c1=new College("mary",500,"JNTU ", "BTECH");

	Hostel h1=new Hostel("HONEY", "BLOCK-2");

	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());


	}

	@Override
	public void studentRecord() {
		System.out.println("Students Selected based on Percentage & Financial Condition");

	}

	@Override
	public void collegeDetail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void studentData() {
		// TODO Auto-generated method stub

	}

}
