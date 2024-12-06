package arraydemo;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :12:05:14 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ArrayInputOutput2 {

	public static void main(String[] args) {
		
		
		
		//Array declaration
				int[] age =new int[10];
				Scanner scanner=new Scanner(System.in);
				
				//Array input
				System.out.println("Enter 10 Student's Age :");
				for (int i = 0; i < age.length; i++) {
					age[i]=scanner.nextInt();
				}
				
				//Process age to check they are eligible to vote or not
				for (int i = 0; i < age.length; i++) {
					if(age[i] >=18) {
						System.out.println(age[i]+" is Eligible");
					}
				}
				
				//Output
			System.out.println("Age Array Contents are : ");
				for (int i = 0; i < age.length; i++) {
					System.out.print(age[i]+"\t");
				}
				scanner.close();

	}

}
