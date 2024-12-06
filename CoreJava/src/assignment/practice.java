package assignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :27-Oct-2024
*Time :11:08:21 am
*Email :Voggu.Reddy@coforge.com
*/

public class practice {

	public static void main(String[] args) {
		
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter a number");
     a= sc.nextInt();
    
     int fact=1;
     for(int i=1;i<=a;i++)
     {
    	 fact=fact*i;
    	 
    
    }
    System.out.println(fact);
    
    


	}

}
