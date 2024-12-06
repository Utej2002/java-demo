package oopsdemo2;

import java.util.List;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :11:41:41 am
 *Email :Voggu.Reddy@coforge.com
 */
//composition example
public class Library {

	private List<Book> books;//Composition -library has book reference object

	public Library(List<Book> books) {
		this.books = books;
	}
	//generate getter() method
	public List<Book> getBooks() {
		return books;
	}




}
