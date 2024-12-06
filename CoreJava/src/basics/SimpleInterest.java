package basics;

import java.util.Scanner;

public class SimpleInterest {
	 
	public static void main(String [] args) {
		  
		
		String customerName;
		double principal;
		float si;
		int term,rate;
		
		
		//create Scanner object for taking input
		
		Scanner Sc= new Scanner(System.in);
		
		
		//Input
		
		System.out.println("*************soft bank-simple interset cal***********");
		System.out.println(" Enter customer name");
		customerName=Sc.nextLine();
		System.out.println(" Enter loan amount");
		principal=Sc.nextDouble();
		System.out.println(" enter loan term ");
		term=Sc.nextInt();
		System.out.println(" enetre interset");
		rate=Sc.nextInt();
		
		
		// calculate simple intersest
		si=(float) (principal*term*rate)/100;
		
		//output
		
		System.out.println("***loan dtails********");
		System.out.println(" customer name:"+ customerName);
		System.out.println(principal);
		System.out.println(term);
		System.out.println(rate);
		System.out.println(si);
		
		
		
		
	}

}
