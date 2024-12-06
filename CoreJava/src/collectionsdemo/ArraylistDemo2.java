package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import oopsdemo4.Marks;

/**
 * Author :Voggu.Reddy
 *Date :05-Nov-2024
 *Time :2:18:45 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class ArraylistDemo2 {

	public static void main(String[] args) {
		ArrayList<String> names =new ArrayList<>();

		names.add("James"); //AutoBoxing
		names.add("Mary");
		names.add("Micheal");
		names.add("Jim");
		names.add("Robert");

		System.out.println("Display ArrayList as List Without Loop :"+names);

		System.out.println("********* Display Collection Objects using Classic For Loop ************");
		for( int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}

		//manipulations
		names.add(3,"honey");
		names.remove(0);
		names.set(4, "reddy");

		System.out.println("**********display content using for  each loo[p****");
		for(String i:names) {
			System.out.println(i);
		}

		ArrayList<Double> marks=new ArrayList<>();
		marks.add(99.6);
		marks.add(55.6);
		marks.add(77.6);
		marks.add(67.6);
		marks.add(98.6);
		System.out.println("*display collec ction object using iteration****");

		Iterator<Double> itr=marks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//collections utlity class function

		Collections.sort(marks);
		System.out.println("the marks of array list after sorting:"+marks);

		Collections.reverse(marks);

		System.out.println("the amrks after reversing:"+marks);

		System.out.println("maximum marks:"+Collections.max(marks));
		System.out.println("minimum marks:"+Collections.min(marks));
	}
}


