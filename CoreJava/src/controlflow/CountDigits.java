package controlflow;
/*
 * program to count the digits in a number
 */

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num=s.nextInt();
		s.close();
		
		/*Logical Operators are used to combine Multiple conditions
	        * && - All conditions should be TRUE, || - Any one Condition Should be TRUE
	        * ! - Negate the Condition */
		
		if(num > -10 && num < 10) {
			System.out.println(num+" is a Single Digit");
		}
		else if(num > -100 && num < 100) {
			System.out.println(num+" is a Double Digit");
		}
		else if(num > -1000 && num < 1000) {
			System.out.println(num+" is a Triple Digit");
		}
		else {
			System.out.println(num+" is more than Three Digits");
		}	

	}

}
