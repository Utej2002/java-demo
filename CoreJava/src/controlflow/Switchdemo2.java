package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :12:39:27 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Program to perform Arithmetic Operations using Switch Cas
 */

public class Switchdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		float num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		scanner.close();

		
		switch(operator) {
		
		case "+": result= num1+num2;
		System.out.println(" the addition of "+num1+" and"+num2+" is : "+result);
		break;
		case "-": result= num1-num2;
		System.out.println(" the sub of "+num1+" and"+num2+" is : "+result);
		break;
		case "*": result= num1*num2;
		System.out.println(" the mul of "+num1+" and"+num2+" is : "+result);
		break;
		case "/": result= num1/num2;
		System.out.println(" the div  of "+num1+" and"+num2+" is : "+result);
		break;
		default: System.out.println("invalid operator");
		break;
		}
		
	}

}
