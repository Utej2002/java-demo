package oopsdemo3;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :12:28:05 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class OverloadDemo {

	public static void main(String[] args) {

		Addition ad1=new Addition(33,45);
		// invoke overloaded methods

		ad1.add();
		ad1.add(999);
		ad1.add(12.4, 56);
		ad1.add(23, 56.76);
		ad1.add(34, 567);
		ad1.add("hello", "honey");
		ad1.add(34, 55, 50);
		ad1.add(50.45f, 45.55f);




	}

}
