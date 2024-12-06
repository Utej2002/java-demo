package exceptionsdemo;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :06-Nov-2024
*Time :12:51:51 pm
*Email :Voggu.Reddy@coforge.com
*/
//Division of 2 Numbers without Exception Handling
public class DivisionWithException {
	public static void main(String[] args) {
		
		

		int a, b, result;
		        Scanner input = new Scanner(System.in);

		        System.out.println("Input two integers :");
		        a = input.nextInt();
		        b = input.nextInt();
		        
		        try {//statements to be monitored which may throw Exception

		        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
		        System.out.println("Result = " + result);
		        }
		      //Exception thrown in try block is handled in catch block
		        //using Exception Object
		        catch(ArithmeticException ex) {
		        	System.out.println("please enter second number with non zero");
		        	System.err.println("exception handling discriptigon:"+ex.toString());
		        	System.err.println("exception discription:"+ex.getMessage());
		        	
		        	ex.printStackTrace();
		        }
		        finally {
					System.out.println("in finally bock");
				
		        input.close();
		        }
		
	}

}

