package controlflow;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :24-Oct-2024
*Time :11:58:53 am
*Email :Voggu.Reddy@coforge.com
*/

public class TernaryDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char myChar;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Character :");
        myChar = scanner.next().charAt(0); //Character I/p

        //Ternary Operator to check Simple Conditions
        String msg =(myChar >= 'a' && myChar <='z' || myChar >= 'A' && myChar <='Z' ) ?
        myChar+" is an Alphabet": myChar+" not an Alphabet";

        System.out.println(msg);


	}

}
