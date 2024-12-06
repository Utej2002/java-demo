package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */

public class Discount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(is);
		
		String name;
		int age;
		boolean isMember;
		
		//ask user for member ship status
		
		System.out.println("  eneter your name:");
		name=br.readLine();
		System.out.println(" eneter your age");
		age=Integer.parseInt(br.readLine()); 
		System.out.println(" are you member ? : (true/false)");
		
	    isMember=Boolean.parseBoolean(br.readLine());
		//check if the user is eligible for discount
		if( age<18 || !isMember )
		{
			System.out.println(name+" is eligible for disount!!");
		}
		else
		{
			System.out.println(name+" is not eligible");
		}
		
	}

}
