package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :2:54:26 pm
 *Email :Voggu.Reddy@coforge.com
 */
//Java Program to store & display User-defined Book Objects in Collections
public class ArrayListBook {

	public static void main(String[] args) {




		//Creating Books  object & initialized using Book Constructor
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

		//create array list of books

		List<Book> bookList=new ArrayList<>();
		//add bok  objects to list

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(new Book(104,"JAVA MADE SIMPLE","Nitihn", "Prime", 15));

		//travel in list

		System.out.println("*******Booklist*********");

		for(Book i:bookList) {
			System.out.println(i.id+" "+i.name+" "+i.name+" "+i.publisher+" "+i.quantity);
		}
		System.out.println("The total NO of books is:"+bookList.size());

		//find BOOK by publisher

		String pub="WILEY";

		for(Book i:bookList) {
			if(i.getPublisher().equalsIgnoreCase(pub)) {
				System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+""+i.quantity);
			}
		}

	}

}
