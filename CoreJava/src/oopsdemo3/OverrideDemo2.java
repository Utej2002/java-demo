package oopsdemo3;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :3:00:49 pm
*Email :Voggu.Reddy@coforge.com
*/

public class OverrideDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicsProduct ep1=new ElectronicsProduct("laptop", 999.99, "Dell","latitude");
		ClothingProduct   cp1=new ClothingProduct("T-shirt", 15.50f, "medium", "Indigo");
		
		System.out.println("********electronic product details*********");
		ep1.displayDetails();
		
		System.out.println("**********clothing product details*********");
		cp1.displayDetails(); 

	}

}
