package oopsdemo3;

/**
 * Author :Voggu.Reddy
 *Date :29-Oct-2024
 *Time :3:41:12 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(String name, double balance,double interestRate) {
		super(name, balance);
		this.interestRate=interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}







}
