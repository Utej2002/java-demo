package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author :Voggu.Reddy
*Date :06-Nov-2024
*Time :12:06:22 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Students> al=new ArrayList<Students>();
		
		al.add(new Students(111,"nitihn", 24));
		al.add(new Students(122,"honey", 23));
		al.add(new Students(133,"teja", 22));
		al.add(new Students(144,"chandu", 22));
		al.add(new Students(155,"psupur", 22));
		
		Collections.sort(al);
		
		for(Students s:al);
		System.out.println(al);

	}

}
