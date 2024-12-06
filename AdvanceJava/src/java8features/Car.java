package java8features;

/**
* Author :Voggu.Reddy
*Date :09-Nov-2024
*Time :11:40:37 am
*Email :Voggu.Reddy@coforge.com
*/

public class Car implements Vehicle{
	
	private String brand;
	
	

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "car is speeding up !!!!!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "car is slowing down !!!!";
	}

}
