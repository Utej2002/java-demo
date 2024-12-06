package oopsdemo2;

/**
 * Author :Voggu.Reddy
 *Date :28-Oct-2024
 *Time :12:06:34 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class SavingsAccount extends Account{
	
	private float minimumbalance;
	protected double balance;

	public SavingsAccount(int accountnumber, String name, float minimumBalance, double balance) {
		super(accountnumber, name);
		this.minimumbalance=minimumBalance;
		this.balance=balance;
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum balance: "+minimumbalance);
		System.out.println("Savings Account Balance  :"+balance);

	}

}
