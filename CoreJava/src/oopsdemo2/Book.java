package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :11:39:23 am
*Email :Voggu.Reddy@coforge.com
*/
//composition Example
public class Book {
	
	String  title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	

}
