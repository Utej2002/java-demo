package genericsdemo;

import java.util.Scanner;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :11:38:50 am
 *Email :Voggu.Reddy@coforge.com
 */

public class TwopairDemo {

	public static void main(String[] args) {

		Pair<String,Integer> p1  = new Pair<String, Integer>("the car guys",8);
		Scanner sc=new Scanner(System.in);


		System.out.println(" oue current rating for:"+p1.getFirst()+"is:"+p1.getSecond());

		System.out.println(" How would you rate them?:");

		int score=sc.nextInt();

		p1.setSecond(score);
		System.out.println("  oue new rating:"+p1.getFirst()+"is"+p1.getSecond());
		Pair<String,Float> p2=new Pair<String, Float>(" Troy",5.6f); 
		System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());

		System.out.println("How would you rate them ?:");
		float score1 =sc.nextFloat();

		p2.setSecond(score1);

		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
	}

}
