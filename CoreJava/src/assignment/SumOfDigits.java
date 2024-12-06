package assignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
* Date   : 24-Oct-2024
* Time   : 9:44:58 pm
* Email  : Voggu.Reddy@coforge.com
*/

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum = 0,rem;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		a=s.nextInt();
		s.close();
		
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		
		System.out.println("The sum of number is "+sum);
	}

}
