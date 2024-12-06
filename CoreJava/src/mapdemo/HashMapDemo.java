package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Author :Voggu.Reddy
 *Date :06-Nov-2024
 *Time :10:16:54 am
 *Email :Voggu.Reddy@coforge.com
 */

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();


		hm.put(111," honey");
		hm.put(222," jim");
		hm.put(333, " nitihn");
		hm.put(433, " chandu");
		hm.put(533, " yash");

		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
