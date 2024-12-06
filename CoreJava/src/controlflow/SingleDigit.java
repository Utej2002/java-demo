package controlflow;

import java.util.Scanner;
//program to check wheather enter number is single digit or not

public class SingleDigit  { 
	public static void main(String[] args) {



		int num;

		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a number :");

		num=sc.nextInt();
		
		//implementing conditional statements
		//logical operators -it is used to continue multiple conditions4
		

		if(num >-10 && num < 100)
		{
			System.out.println( num+" IS single digit");


		}
		else
		{
			System.out.println(" is not single digit");
		}
		sc.close();

	}
}
