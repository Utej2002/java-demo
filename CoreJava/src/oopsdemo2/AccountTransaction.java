package oopsdemo2;

/**
 * Author :Voggu.Reddy
 *Date :28-Oct-2024
 *Time :12:12:39 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class AccountTransaction extends SavingsAccount{

	private static final double Balance = 0;
	private double withdrawal,deposit,finalBalance;

	public AccountTransaction(int accountnumber, String name, float minimumBalance, double balance,double withdrawal,double deposit) {
		super(accountnumber, name, minimumBalance, balance);
		// TODO Auto-generated constructor stub
		this.deposit=deposit;
		this.withdrawal=withdrawal;
		this.finalBalance=0;
	}
	public void display()
	{
		super.display();
		System.out.println("Deposit Amount    : "+deposit);
		System.out.println("Withdrawal Amount : "+withdrawal);
		finalBalance=(Balance+deposit)-withdrawal;
		System.out.println("Final Balance     : "+finalBalance);
	}



}
