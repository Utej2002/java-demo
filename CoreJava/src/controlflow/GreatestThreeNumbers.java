package controlflow;
/*
 * program to find greatest of 3 numbers
 */

import java.util.Scanner;

public class GreatestThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		
		System.out.println(" eneter 3  numbers");
		
		
		if(a >b && a>c)
		{
			System.out.println(a+" is greatest");
		}
		else if(b>c)
			
		{
			System.out.println(b+" is gretest");
			
		}
		else if(a==b && a==c)
		{
			System.out.println("all numbers are equal");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
		Sc.close();

	}

}
