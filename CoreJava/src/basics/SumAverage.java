package basics;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		
		sum=a+b+c;
		avg=(float) sum/3;
		
		 System.out.println(sum);
		 System.out.println(avg);
		System.out.println("the average of 3 numbers is:"+String.format("%.2f",avg));
		

	}

}
