package jdbcdemo;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 07-Nov-2024
* Time   : 4:43:51 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Skills s=new Skills();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Candidate Id : ");
			int id = sc.nextInt();
			
			s.getSkills(id);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
