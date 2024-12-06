package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :25-Oct-2024
*Time :9:19:29 am
*Email :Voggu.Reddy@coforge.com
*/
/*
 * program to display vowels in a string (a,e,i,o,u)
 */

public class VowelsCheck {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String sentence;
		
		System.out.println(" enter a sentence");
		
		sentence=sc.nextLine();
		
		String sentence1=sentence.toLowerCase();
		int count=0;
		sc.close();
		
		for( int i=0; i<sentence.length();i++)
		{
			if(sentence1.charAt(i)== 'a' || sentence1.charAt(i)=='e' || sentence1.charAt(i)=='i'|| sentence1.charAt(i)=='o' || sentence1.charAt(i) =='u')
			{
				count=count+1;
			}
		}
		System.out.println(" the total no of vowels in \""+sentence +"\" is :"+count);
			
		
		
		
		

	}

}
