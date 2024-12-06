package controlflow;
/*
 * program to find sum and average of 3 numbers
 */

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		
		System.out.println(" eneter 3  numbers");
		
		 if(a>100 && b>100 && c>100) 
		 {
			 
	
		sum=a+b+c;
		avg=(float) sum/3;
		
		 System.out.println(sum);
		 System.out.println(avg);
		System.out.println("the average of 3 numbers is:"+String.format("%.2f",avg));
		 }
		 else
		 {
			 System.out.println("please enter numbers geather than 100");
		 }
		
          Sc.close();
	}

}
