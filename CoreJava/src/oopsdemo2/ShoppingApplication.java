package oopsdemo2;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :11:47:45 am
*Email :Voggu.Reddy@coforge.com
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		
		
		Scanner  sc=new Scanner(System.in);
		System.out.println(" ******* Online shopping portal*********");
		System.out.println(" Enter customer name & Email:");
		String name=sc.nextLine();
		String email=sc.nextLine();
		
		
		ShoppingCart cart1 =new ShoppingCart("Mary John","mary@wipro.com");

        System.out.println("********** Online Shopping Portal ************");

        //Add items to Cart
        cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
        cart1.addItem("Logitech Mouse");
        cart1.addItem("Samsung HDD");
        cart1.addItem("HP Laser Printer");
        cart1.addItem("pen drive");
        cart1.addItem(" HDMI Converter");

        System.out.println("Customer Details :");
        cart1.display(); //Base class method
        System.out.println("Cart Details :");
        cart1.displayCart();


	}

}
