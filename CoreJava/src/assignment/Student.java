package assignment;

import oopsdemo1.ThisDemo;

/**
* Author :Voggu.Reddy
*Date :27-Oct-2024
*Time :4:08:29 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Student {
	
	private String name;
	private int yearofjoining;
	private String address;
	
	public Student(String name,int yearofjoining,String address) {
		this.name=name;
		this.address=address;
		this.yearofjoining=yearofjoining;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//method to display student information
	public void DisplayInfo()
	{
		System.out.println( getName()+" " +getYearofjoining()+""+getAddress());
	}
	

}
