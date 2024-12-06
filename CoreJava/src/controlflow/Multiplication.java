package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :3:15:45 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * program to display multiplication table of a number
 */

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i=1,num,mul;
         
         Scanner sc=new Scanner(System.in);
         
         System.out.println(" enter anumber");
         num=sc.nextInt();
         sc.close();
         
         
         System.out.println(" ********multiplication table*******");
         
         
         while(i<=10)
         {
        	 mul=num*i;
        	 System.out.println(num+" *" +i+"="+mul);
        	 i+=1;
         }
        	 
	}

}
