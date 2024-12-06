package oopsdemo3;

/**
* Author :Voggu.Reddy
*Date :29-Oct-2024
*Time :3:43:57 pm
*Email :Voggu.Reddy@coforge.com
*/

public class CheckingAccount extends Account{
	
	private int overDraft;

	public CheckingAccount(String name, double balance,int i) {
		super(name, balance);
		this.overDraft=i;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
		System.out.println("Overdraft Amount: " + overDraft);
		if (amt <= balance) {
			balance -= amt;
			System.out.println("Withdrawing: " + amt);
		} else if ((amt > balance) && (amt > (balance + overDraft))) {
			System.out.println("Sorry! You cannot withdraw");
		} else {
			double result = amt - balance;
			overDraft -= result;
			balance = 0;

			System.out.println("Withdrawing: " + amt);
			System.out.println("Current Overdraft Amount: "
					+ overDraft);
		}
	}
	

}
