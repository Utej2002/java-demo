package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :3:07:42 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * program to find sum of series 1+2+3+.....+n
 */

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i=1,sum=0;
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 num=Sc.nextInt();
		 
		 while(i<=num)
		 {
			 sum=sum+i;
			 i=i+1;
		 }
		 System.out.println(" sum of series:"+sum);
		 Sc.close();
			 
			 
		 }

	}

