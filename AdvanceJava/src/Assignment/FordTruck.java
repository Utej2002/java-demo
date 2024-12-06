package Assignment;

/**
* Author :Voggu.Reddy
*Date :10-Nov-2024
*Time :7:15:18 pm
*Email :Voggu.Reddy@coforge.com
*/

public class FordTruck implements Truck{
	private final int axles;
	private final int weight;
	
	public FordTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getbrand() {
		// TODO Auto-generated method stub
		return "ford";
	}
	 
	
	
}
