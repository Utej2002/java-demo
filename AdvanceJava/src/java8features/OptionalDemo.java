package java8features;

import java.util.Optional;

/**
* Author :Voggu.Reddy
*Date :09-Nov-2024
*Time :3:36:47 pm
*Email :Voggu.Reddy@coforge.com
*/

public class OptionalDemo {

	public static void main(String[] args) {
//		String s=null;
//		Integer a=null;
//		
//		System.out.println(s.length());// throw Null Pointer Exception
//		
		String s="Hello World";
		//String s=null;
		//Optional object is a container for not null objects
		Optional<String> checkNull=Optional.ofNullable(s);
		
		if(checkNull.isPresent())
		{
			System.out.println("Length of String is : "+s.length());
			checkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(checkNull.get());
		}
		else
		{
			System.out.println("String not Present");
		}

	}

}
