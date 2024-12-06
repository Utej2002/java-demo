package exceptionsdemo;

/**
* Author :Voggu.Reddy
*Date :06-Nov-2024
*Time :4:46:14 pm
*Email :Voggu.Reddy@coforge.com
*/

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(500.00); //Initial Balance

        System.out.println("Attempting to deposit $200:");
        account.deposit(200.00);

        System.out.println("\nAttempting to withdraw $800:");
        try {
            account.withdraw(800.00);
        } catch (InsufficientFundsException e) {  //Catch Custom Exceptions
            System.out.println("Exception caught: " + e);
        }

        System.out.println("\nAttempting to withdraw $300:");
        try {
            account.withdraw(300.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("\nFinal Balance: " + account.getBalance());

	}

}
