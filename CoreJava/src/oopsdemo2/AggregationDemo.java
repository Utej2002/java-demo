package oopsdemo2;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :10:08:00 am
*Email :Voggu.Reddy@coforge.com
*/

public class AggregationDemo {

	public static void main(String[] args) {
		
		
		Address ad1= new Address("bengaluru","karnataka","India",560076);
		Address ad2=new Address("prague"," Austin"," Czech Republic",777777);
		
		Student s1=new Student(101,"Ravi kumar", ad1);
         Student s2=new Student(102," honey",ad2);
         
         s1.display();
         s2.display();
         
       
	}

}
