package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :5:08:18 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Program to find Factorial of a Number 1 + 1 * 2 * 3 * .... * n
 */

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,fact=1,i;
		Scanner scanner=new Scanner(System.in);
 
		System.out.println("Enter a Number : ");
		n=scanner.nextInt();
 
		if(n > 0) {
			//Loop to find factorial
			for(i=1;i<=n;i++) {
				fact =fact *i;
			}
 
			System.out.println("The Factorial of "+n+" is : "+fact);
			scanner.close();
		}
		else {
			System.out.println("Please Enter Value greater Than Zero");
		}


	}

}
