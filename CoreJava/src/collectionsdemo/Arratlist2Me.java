package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author :Voggu.Reddy
*Date :07-Nov-2024
*Time :3:28:20 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Arratlist2Me {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("x");
		al.add("y");
		al.add("s");
		al.add("r");
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		//sort
		Collections.sort(al);
		System.out.println(al);

	}

}
