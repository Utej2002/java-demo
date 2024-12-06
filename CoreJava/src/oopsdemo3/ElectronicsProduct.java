package oopsdemo3;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :2:51:53 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ElectronicsProduct extends Product{
	
	private String name;
	private String model;
	

	public ElectronicsProduct(String name, double price, String name2, String model) {
		super(name, price);
		name = name2;
		this.model = model;
	}


	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		 String brand = null;
		System.out.println("Brand   : "+brand);
	        System.out.println("Model   : "+model);
	        System.out.println("Warranty: 1 Year");
	}
    

	

}
