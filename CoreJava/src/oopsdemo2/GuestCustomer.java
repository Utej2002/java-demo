/**package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :2:38:10 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Hierarchical Inheritance Demo
 *    customer
 *    guest customer     registered customer

	
	
	public class GuestCustomer extends Customer {
    public GuestCustomer(String name, String Email) {
		super(name, Email);
		// TODO Auto-generated constructor stub  
	}

		 	private String[] cart1;
		    private int cartSize;
		    private static final int MAX_CART_SIZE=5;
		    
		public void addToCart(String item) {
		        if (cartSize < MAX_CART_SIZE) {
		            cart1[cartSize] = item;
		            cartSize++;
		            System.out.println(item + " added to cart.");
		        } else {
		            System.out.println("Cart is full. Cannot add more items.");
		        }
		    }

		    public void displayCart() {
		        System.out.println("Items in Cart:");
		        for (int i = 0; i < cartSize; i++) {
		            System.out.println(cart1[i]);
		        }
		    }

		    

		
	}
	
	
	

}
**/
