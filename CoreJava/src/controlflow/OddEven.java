package controlflow;
/*
 *  java program for odd even
 */

import java.util.Scanner;

import basics.ScannerNextDemo;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("e nter a number ");
		
		num=Sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println( num+ "is  a even number");
			
		}
		else 
		{
			System.out.println(num+ " is a odd number");
		}
		Sc.close();
		

	}

}
