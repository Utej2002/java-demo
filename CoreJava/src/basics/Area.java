package basics;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Java Program to find Area of Circle
		 */

		Scanner s=new Scanner(System.in);
		float a,r;   // variables declaration
		final float PI=3.14f; // constant declaration

		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();  // float input

		a=PI*r*r;  // calculate area of circle

		System.out.println("The Area of Circle is : "+a);
		System.out.format("%.2f", a);

		s.close();


	}

}
