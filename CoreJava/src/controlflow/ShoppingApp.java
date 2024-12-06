package controlflow;

import java.util.Scanner;

/**
 * Author :Voggu.Reddy
 *Date :24-Oct-2024
 *Time :4:30:52 pm
 *Email :Voggu.Reddy@coforge.com
 */
/*
 * Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 */
/*
 * Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 */

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput=null;
		Scanner sc=new Scanner(System.in);

		do {
			//display shopping items
			System.out.println("welcome to  our online shopping app");
			System.out.println("1. view product");
			System.out.println("2. add product");
			System.out.println("3. checkout");
			System.out.println("exit");

			System.out.println(" Enter your choice");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("display product......");
				break;
			case 2:
				System.out.println("adding product......");
				break;
			case 3:
				System.out.println("checking out......");
				break;
			default:
				System.out.println(" invalid choice. please try again");
			}

			System.out.println("  do you want to continue shopping ? (yes/no) :");
			userInput=sc.next();
		}

			while(userInput.equalsIgnoreCase("yes"));

			System.out.println(" thanks for shopping with us !!!!!!!!!!!");
			sc.close();
		}
		
	}
