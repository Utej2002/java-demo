package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :10:23:21 am
*Email :Voggu.Reddy@coforge.com
*/

public class MagzineAggregationDemo {

	public static void main(String[] args) {
		
		Author author= new Author("Nitihn",23,"IND");
		
		Publisher publisher= new Publisher(" HONEY PUBLICATIONS","JDSR-II234","UA");
				
				
	    Magazine magazine1=new Magazine("wolf strre",102, publisher);
	    
	    magazine1.display();

	}

}
