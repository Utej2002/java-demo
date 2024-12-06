package oopsdemo4;

/**
 * Author :Voggu.Reddy
 *Date :30-Oct-2024
 *Time :11:52:43 am
 *Email :Voggu.Reddy@coforge.com
 */

public class Director extends Employee{

	private double transportAllowance;

	public Director(String name, double basic, String address,double transportAllowance) {
		super(name, basic, address);
		this.transportAllowance=transportAllowance;
		// TODO Auto-generated constructor stub
	}

	@Override
	double totalPay() {
		// TODO Auto-generated method stub
		double totalAmount = 0;
		double houseRentAllowance = (basic * 0.20);
		double dearnessAllowance = (basic * 0.5);
		double medicalAllowance = 4500;
		double entertainmentAllowance = 5000;
		totalAmount = basic + houseRentAllowance + dearnessAllowance
				+ medicalAllowance + entertainmentAllowance + transportAllowance;
		return totalAmount;

	}

	void show() {
		super.show();
		System.out.println("Transport Allowance: \t" + transportAllowance);
	}
}



