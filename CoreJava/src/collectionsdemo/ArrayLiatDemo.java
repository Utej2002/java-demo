package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :12:40:10 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class ArrayLiatDemo {

	public static void main(String[] args) {
		//generic array list 
		ArrayList<String> a1=new ArrayList<String>();

		//add elements
		a1.add("java");
		a1.add("pcle");
		a1.add("c++");
		a1.add("c++ 5.0f");
		a1.add("java");
		a1.add("python");
		System.out.println(a1);
		System.out.println("elements index 1:"+a1.get(1));

		System.out.println(" does list contains elements java:"+a1.get(1));

		// add elements at specific index

		a1.add(2,"oracel");
		System.out.println(a1);


		System.out.println(" Is array list Empty:"+a1.isEmpty());
		System.out.println(" Index of perl:"+a1.indexOf("perl"));
		System.out.println(" Size of arraylist:"+a1.size());

		//collection is a utility class

		Collections.sort(a1);
		System.out.println(" array list after sorting:"+a1);

		//a2.add(10)
		ArrayList<Integer> a2=new ArrayList<Integer>();

		a2.add(100);
		a2.add(500);
		a2.add(10);
		a2.add(60);
		a2.add(10);
		System.out.println(a2);
		System.out.println("size :"+a2.size());



	}

}
