package controlflow;

import java.util.Scanner;

/**
 * Author :Voggu.Reddy
 *Date :24-Oct-2024
 *Time :3:24:13 pm
 *Email :Voggu.Reddy@coforge.com
 */
/*
 * program to display odd and even numbers
 */

public class DisplayOddEven {

	public static void main(String[] args) {

		int i=1;
		
		System.out.println("0dd\teven");
		System.out.println("....\t......");
		
		while(i<=10)
		{
			if(i%2==1) {
				System.out.print(i+"\t");
			}
			else {
				System.out.println(i);
			}
			i=i+1;
		}
	}
}
