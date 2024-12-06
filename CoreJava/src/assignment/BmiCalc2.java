package assignment;

import java.util.Scanner;

/**
* Author : Voggu.Reddy
* Date   : 24-Oct-2024
* Time   : 8:25:58 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class BmiCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float weight,height,BMI;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the weight in kgs: ");
		weight=s.nextFloat();
		System.out.println("Enter the height in meters: ");
		height=s.nextFloat();
		
		BMI=weight/(height * height);
		System.out.println("Your BMI is "+String.format("%.3f", BMI));
		s.close();
		

	}

}
