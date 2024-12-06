package assignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :27-Oct-2024
*Time :4:20:07 pm
*Email :Voggu.Reddy@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {
		
		Student Student1=new Student("Robert",1994,"64c-WallsStreet");
		Student Student2=new Student("sam",2000,"68cD-WallsStreet");
		Student Student3=new Student("john",1999,"26B-WallsStreet");
		
		System.out.println("Name year of joining address");
		Student1.DisplayInfo();
		Student2.DisplayInfo();
		Student3.DisplayInfo();
		
		

	}

}
