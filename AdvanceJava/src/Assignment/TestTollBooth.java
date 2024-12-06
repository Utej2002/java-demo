package Assignment;

/**
 * Author :Voggu.Reddy
 *Date :10-Nov-2024
 *Time :7:23:02 pm
 *Email :Voggu.Reddy@coforge.com
 */

public class TestTollBooth {
	public static void main(String[] args) {
		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12500); // 5 axles and 12500 kilograms
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000 kg
//		Truck daewoo = new DaewooTruck(6, 17000); // 6 axles and 17000 kg

		booth.calculateToll(ford);
		booth.calculateToll(nissan);
//		booth.calculateToll(daewoo);

		booth.collectReceipts();
	}

}
