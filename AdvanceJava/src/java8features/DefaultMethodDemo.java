package java8features;

import java.time.LocalDate;

/**
 * Author :Voggu.Reddy
 *Date :09-Nov-2024
 *Time :11:21:02 am
 *Email :Voggu.Reddy@coforge.com
 */
interface Parser{

	default void parse() {
		System.out.println("default prasing logic");
	}
	static void displayDate() {
		System.out.println(LocalDate.now());
	}

	class TextParser implements Parser
	{
		void display() {
			System.out.println("hello text parser");
		}
	}
	class XMLPraser implements Parser{

		public void prase() {
			System.out.println("prasing XML files");
		}
	}



	public class DefaultMethodDemo {

		public static void main(String[] args) {

			Parser p=new TextParser();  //up casting
			p.parse();//invoke default method in interface

			TextParser p1=new TextParser();// references child class textparser
			p1.display();
			
			p=new XMLPraser();// references child class XMLparser
			p.parse();//invoke overridden method
			
			System.out.println("PROGRAM EXECUTED ON:");
			Parser.displayDate(); //invoke static method
		
		}

	}
}
