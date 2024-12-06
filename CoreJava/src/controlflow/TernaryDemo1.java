package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :11:46:31 am
*Email :Voggu.Reddy@coforge.com
*/ 
/*
 * program for ternary demo 1
 */

public class TernaryDemo1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 int num1,num2,result;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Enter 2 Numbers :");
	        num1=Integer.parseInt(br.readLine());
	        num2=Integer.parseInt(br.readLine());
	        
	        
	        //ternary operator to check simple  conditions
	        
	        String msg= (num1 >num2)?" num1 is greatest":"num2 is greatest";
	        System.out.println(msg);
	        
	        result=(num1>num2)?num1:num2;
	        System.out.println(result);

	}

}
