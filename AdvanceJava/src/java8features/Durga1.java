package java8features;


import java.util.function.Predicate;

/**
* Author :Voggu.Reddy
*Date :08-Nov-2024
*Time :6:41:26 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Durga1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println(p.test(2));

	}

}
