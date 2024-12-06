package oopsdemo1;

/**
* Author :Voggu.Reddy
*Date :26-Oct-2024
*Time :12:05:06 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 Encapsulation, is to make sure that "sensitive" data is hidden from users(Main class).
 *
 *  To achieve this, you must: declare class variables/attributes as private &
 *  provide public get and set methods to access and update the value of a private variable
 *
 * The get method returns the value of the variable name. - Ouput
 * The set method takes a parameter (newName) and assigns it to the name variable. - Input
 
 */

public class Book {

		// TODO Auto-generated method stub
		
		
		 
		 //Attributes
			private int bookId;
			private String bookName;
			private float price;
			private String publisher;
			public int getBookId() {
				return bookId;
			}
			public void setBookId(int bookId) {
				this.bookId = bookId;
			}
			public String getBookName() {
				return bookName;
			}
			public void setBookName(String bookName) {
				this.bookName = bookName;
			}
			public float getPrice() {
				return price;
			}
			public void setPrice(float price) {
				this.price = price;
			}
			public String getPublisher() {
				return publisher;
			}
			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}
			public float calculateDiscountPrice() {
				return((this.price)=(this.price*.10f));
			}
			@Override
			public String toString() {
				return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher="
						+ publisher + "]";
			}
			
			//Default Constructor - 
					//Compiler Creates it for Automatic initialization of Object Properties
			
			//Generate getters & setters
			//Place cursor in New Line --> Source menu --> Generate Getters and Setters -->
			// Select All --> Generate

	}

