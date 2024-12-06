package logicbuildingassignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :10-Nov-2024
*Time :7:32:25 pm
*Email :Voggu.Reddy@coforge.com
*/

public class pyramidofNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = scanner.nextInt();
 
		for (int i = 1; i <= n; i++) {
			
			//printing leading spaces
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
 
			//printing increasing numbers
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
 
			//printing decreasing numbers
			
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
 
			//move to the next line after each row
			
			System.out.println();
		}
 
		scanner.close();
	}
}


