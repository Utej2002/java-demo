package basics;

import java.util.Scanner;

/*
 * find the volume of cyclinder
 */

public class VolumeOfCyclinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		float a,r,h ;   // variables declaration
		final float PI=3.14f; // constant declaration
        
		System.out.println("Enter volume of a cyclinder :");
		r=sc.nextFloat();  // float input
		System.out.println("enter height");
		h=sc.nextFloat();

		a=(float) PI*r*r*h; // calculate area of circle

		System.out.println("The radius of cyclinder is : "+a);
		System.out.format("%.2f", a);

		sc.close();

	}

}
