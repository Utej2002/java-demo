package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* Author :Voggu.Reddy
*Date :07-Nov-2024
*Time :2:43:09 pm
*Email :Voggu.Reddy@coforge.com
*/

public class ArrayListMe {

	public static void main(String[] args) {
		// declare array list
		
		ArrayList al=new ArrayList();
		//ArrayList<Integer> al=new ArrayList();
		
		//add new elements to array list
		
		al.add(100);
		al.add("HII");
		al.add(23.4);
		
		System.out.println(al);
		
		//size
		
		System.out.println(" number of elements in arary list:"+al.size());

		
		//remove
		al.remove(2);
		System.out.println(" after removing element from arraylist:"+al);

		
		//insert anew element
		al.add(1,"hello add chesa chudu");
		
		System.out.println("after adding :"+al);
		
		//retrive a specific value
		al.get(2);
		System.out.println(" after retrive"+al.get(2));
		
		//change element
		al.set(2,"java code");
		System.out.println("after changing element:"+al);
		
		//al.contains(100);
		System.out.println(al.contains(100));
		
		//is empty
		System.out.println(al.isEmpty());
		
		
		// ways to read or retrive data from array list
		
		//forloop
		//foreachloop
		//iterator
		
		
		//System.out.println("reading elements using for loop---");
		/**for(int i=0;i<=al.size();i++) {
			al.get(i);
			System.out.println(al.get(i));
			
			
		}*/
		
		/**for(Object a:al) {
			
			System.out.println(a);
			
		}*/
		//iterator
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			
		System.out.println(it.next());
		}
			//)
	}

}
