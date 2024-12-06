
/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :12:44:10 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class Book implements IItem{

	private String title;
	private  String author;
	private  boolean available;



	public Book(String title, String author, boolean available) {
		this.title = title;
		this.author = author;
		this.available=available;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Book";
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

	@Override
	public void borrowItem() {
		// TODO Auto-generated method stub
		if (available) {
			available = false;
			System.out.println(title + " has been borrowed.");
		} else {
			System.out.println(title + " is not available.");
		}


	}

	@Override
	public void returnItem() {
		// TODO Auto-generated method stub
		available = true;
		System.out.println(title + " has been returned.");


	}

}
