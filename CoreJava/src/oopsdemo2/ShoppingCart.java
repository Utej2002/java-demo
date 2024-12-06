package oopsdemo2;

/**
 * Author :Voggu.Reddy
 *Date :28-Oct-2024
 *Time :11:40:52 am
 *Email :Voggu.Reddy@coforge.com
 */
//Child class of Customer for Managing Cart

public class ShoppingCart extends Customer {

	private String[] items;
	private  int itemCount;

	public ShoppingCart(String name, String Email) {
		super(name, Email, Email);
	
		items=new String[5]; //Max 5 items can be Added to Cart
		itemCount=0; //To Keep Track of no. of Items in Cart
	}  

	public void addItem(String item){
		if(itemCount < items.length){
			items[itemCount]=item;
			itemCount++;
			System.out.println(item+" Added to Cart");
		}else {
			System.out.println("Cart is Full. Cannot Add More Items.");
		}
	}

	public void displayCart(){
		System.out.println("Items in Cart: ");
		for (int i = 0; i < itemCount; i++) {
			System.out.println("\t"+items[i]);
		}
	}


}
