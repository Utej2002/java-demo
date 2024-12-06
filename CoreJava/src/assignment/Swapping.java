package assignment;

import java.util.Scanner;

/**
* Author : Voggu.Reddy
* Date   : 24-Oct-2024
* Time   : 8:15:13 pm
* Email  : Voggu.Reddy@coforge.com
*/

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter values a and b : ");
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		 
		a=a+b; 
		b=a-b; 
		a=a-b; 
		
		System.out.println(".....After Swapping.....");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		

	}

}
