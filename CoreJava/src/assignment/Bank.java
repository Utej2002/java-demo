package assignment;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :27-Oct-2024
*Time :6:12:14 pm
*Email :Voggu.Reddy@coforge.com
*/

public class Bank {
	
		private String name;
		private long accountNo;
		private float balance;
		
		Scanner s=new Scanner(System.in);
		
		public void setName() {
			System.out.println("Enter your Name: ");
			name=s.next();
		}
		public void setAccountNo() {
			System.out.println("Enter your Account No: ");
			accountNo=s.nextLong();
		}
		
		public void deposit() {
			System.out.println("Enter amount to deposit: ");
			float d=s.nextFloat();
			balance+=d;
			System.out.println("*****Account Details******");
			System.out.println("Name:          "+name);
			System.out.println("AccountNo:     "+accountNo);
			System.out.println("Deposit Amount: "+d);
			System.out.println("Balance Amount: "+balance);
			
		}
		
		public void withdraw() {
			System.out.println("Enter amount to withdraw: ");
			float d=s.nextFloat();
			balance-=d;
			System.out.println("*****Account Details******");
			System.out.println("Name:          "+name);
			System.out.println("AccountNo:     "+accountNo);
			System.out.println("Withdraw Amount: "+d);
			System.out.println("Balance Amount: "+balance);
			
		}
		
		
	}


