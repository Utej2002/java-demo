package oopsdemo3;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :3:28:27 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Book extends Item {
	
	private String author;

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("author :"+author);
	}
	

}
