package basics;

import java.util.Scanner;

/*
 *  perform arthimetic operations using scanner input methods
 */

public class Arithmetic {

	public static void main(String[] args) {
		
		// Declaration of variables
		int a,b,sum,sub,mul;
		float div;
		String name;
		Scanner Sc=new Scanner(System.in);
		
		// Input statement-Take input using scanner object
		System.out.println(" Enter 2 numbers:");
		a=Sc.nextInt();
		b=Sc.nextInt();
		System.out.println(" Enter your name:");
		name=Sc.nextLine();
		Sc.nextLine();
		//process
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		
		// Display output
		System.out.println("*******Arthimetic operations********");
		System.out.println(" Addition of 2 numbers is   :"+sum);
		System.out.println("substaration of 2 numbers is:"+sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(" program created by:"+name);
		System.out.println("****************************************************************************");

	}

}
