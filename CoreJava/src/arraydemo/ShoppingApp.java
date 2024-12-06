package arraydemo;

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

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput=null;
		Scanner sc=new Scanner(System.in);
		
		
		String[] products= {"logitech","boat earbuds","hp laptop"," i phone"," hp printer"," phillips light"};
		
		String[] cart=new String[products.length];
	    int choice=sc.nextInt();
	    int cartIndex=0;
	    
	    
				

				do {
			//display shopping items
			System.out.println("");
			System.out.println("1. view product");
			System.out.println("2. add product");
			System.out.println("3. checkout");
			System.out.println("exit");

			System.out.println(" Enter your choice");
			//int Choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("display product......");
				
				for(int i=0;i<products.length;i++)
				{
					System.out.println((i+1)+", "+products[i]);
				}
				break;
			case 2:
				System.out.println("adding product......");
				System.out.println(" enter product number to  add to cart");
				int pno= sc.nextInt();
				if(pno >0 && pno <= products.length) {
					cart[cartIndex++]=products[pno-1];
					System.out.println(" product added to cart");
					
				}
				else {
					System.out.println(" invalid product cart");
				}
				break;
			case 3:
				System.out.println("checking out......your cart contents");
				
				for(int i=0;i<cartIndex;i++) 
				{
					System.out.println((i+1)+"."+cart[i]);
				}
				
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
