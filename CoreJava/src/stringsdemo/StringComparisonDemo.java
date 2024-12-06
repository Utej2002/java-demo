package stringsdemo;

/**
 * Author :Voggu.Reddy
 *Date :04-Nov-2024
 *Time :12:09:35 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class StringComparisonDemo {

	public static void main(String[] args) {

		String s1="james Gosling";
		//String s2="james Gosling";
		String s2="james gosling";

		String s3=("HELLO WORLD");
		String s4=("HELLO WORLD");

		if(s1==s2) // == operator checks wheather strings point to sME REFERENCE
		{



			System.out.println(" Strings are equal");
		}
		else {
			System.out.println(" Strings are notequal");
		}

		if(s3.equals(s4)) // Equals() method checks wheather strings are equal

			System.out.println("strings are equal");
		else
			System.out.println(" String sare notequal");




	}

}
