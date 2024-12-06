package oopsdemo2;

import java.util.Scanner;

/**
* Author :Voggu.Reddy
*Date :28-Oct-2024
*Time :12:22:11 pm
*Email :Voggu.Reddy@coforge.com
*/
/*
 * Java Program to demonstrate Banking Transactions using Multi-Level Inheritance
 */
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java Program to demonstrate Banking Transactions using Multi-Level Inheritance

        Scanner scanner=new Scanner(System.in);
        System.out.println("********** Welcome to Soft Bank ************");

        System.out.println("Enter Account Number & Customer Name:");
        int accountNumber=scanner.nextInt();
        String name=scanner.nextLine();

        //Constant declaration
        final float MIN_BAL=1000;
        final double BALANCE=5000; // Initial Balance while creating SavingsAccount

        System.out.println("Enter Amount to be Deposited : ");
        double deposit=scanner.nextDouble();
        System.out.println("Enter Amount to Withdrawal :");
        double withdrawal=scanner.nextDouble();

        //Create Object of AccountTransactions
        AccountTransaction transaction1,transaction2;

        transaction1=new AccountTransaction(accountNumber,name,MIN_BAL,BALANCE,withdrawal,deposit);
        transaction2 =new AccountTransaction(9999,"Mary Smith",MIN_BAL,BALANCE,7000,5000);

        transaction1.display();
        transaction2.display();
        scanner.close();

	}

}
